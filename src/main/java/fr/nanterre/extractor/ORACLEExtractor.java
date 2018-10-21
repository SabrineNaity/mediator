package fr.nanterre.extractor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ORACLEExtractor {

    public class GenericDao {


        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/source2";
        String uid = "root";
        String passwd = "root";
        Connection cx = null;
        Statement stmt = null;

        public void connexion() {
            try {
                Class.forName(driver);
                cx = (Connection) DriverManager.getConnection(url, uid, passwd);
                stmt = (Statement) cx.createStatement();
                System.out.println("//connexion success");
            } catch (Exception e) {
                System.out.println("//connexion failed");
                throw new RuntimeException(e);
            }
        }


        public  List<String[]> findAll(String table, String[] fields) {
            List<String[]> results = new ArrayList<String[]>();
            try {
                connexion();
                String sql = "SELECT * FROM " + table+";";
                ResultSet res = stmt.executeQuery(sql);
                while (res.next()) {
                    String[] result = new String[fields.length];
                    for (int i = 0; i < result.length; i++) {
                        result[i] = res.getString(fields[i]);
                    }
                    results.add(result);
                }
                return results;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public String[] findById(String table,String[] fields, String id) {
            List<String[]> res =findByAttribute(table,fields,"id",id);
            if (res.size()>=0){
                return res.get(0);
            }
            return null;
        }

        public List<String[]> findByAttribute(String table,String[] fields, String attributeName, String attributeValue) {
            List<String[]> results = new ArrayList<String[]>();
            try {
                connexion();
                String sql = "SELECT * FROM " + table+" WHERE " + attributeName +" ="+attributeValue+";";
                System.out.println(sql);
                ResultSet res = stmt.executeQuery(sql);
                while (res.next()) {
                    String[] result = new String[fields.length];
                    for (int i = 0; i < result.length; i++) {
                        result[i] = res.getString(fields[i]);
                    }
                    results.add(result);
                }
                return results;
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


        /*
         * skip the first field
         */

        private String toSqlFields(String[] fields) {
            StringBuffer sb = new StringBuffer();
            sb.append("(");
            for (int i = 1; i < fields.length; i++) {
                sb.append(fields[i]);
                if (i < fields.length - 1) {
                    sb.append(",");
                }

            }
            sb.append(")");
            return sb.toString();
        }

        private String toSqlValues(String[] fields) {
            StringBuffer sb = new StringBuffer();
            sb.append("(");
            for (int i = 0; i < fields.length; i++) {
                sb.append("'" + fields[i] + "'");
                if (i < fields.length - 1) {
                    sb.append(",");
                }

            }
            sb.append(")");
            return sb.toString();
        }

    }
}
