package fr.nanterre.connector;

import java.sql.*;

public class ConnectorExcel implements Connector {
    String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    String url = "C:\\Users\\Milad\\M2\\IDD\\mediator-master\\src\\main\\resources";
    Connection con = null;
    Statement stmt = null;
    public void connectToSource() {
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from [2006$]");

            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();

            while (rs.next()) {

                for (int i = 1; i <= numberOfColumns; i++) {
                    if (i > 1)
                        System.out.print(", ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue);
                }
                System.out.println("");
            }

            stmt.close();
            con.close();

        } catch (Exception ex) {
            System.err.print("Exception: ");
            System.err.println(ex.getMessage());
        }
    }
}
