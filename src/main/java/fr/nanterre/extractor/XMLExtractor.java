package fr.nanterre.extractor;
import fr.nanterre.XMLmodel.Enseignant;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLExtractor {

    private static final String XML_BD="src/main/resources/Univ_BD_3.xml";

    public Document init(){
        Document document = null;
        DocumentBuilderFactory factory = null;
        DocumentBuilder builder = null;
        try {
            factory = DocumentBuilderFactory.newInstance();
            builder = factory.newDocumentBuilder();
            document = builder.parse(XML_BD);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return document;
    }
    public void loadAll() {
        Document document = this.init();
        final Element racine = document.getDocumentElement();
        NodeList nodeList= racine.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node=nodeList.item(i);
            printItems(node);
        }
    }

    private void printItems(Node node){

    if(node.getNodeType()== Node.ELEMENT_NODE) {
        NodeList nodeList = node.getChildNodes();
        if (nodeList.getLength() > 1) {
            System.out.println("==================" + node.getNodeName() + "[" + nodeList.getLength() + "]======================");
            extractEnseignants(node);
        }

       // } else
         //   System.out.println("name= " + node.getNodeName() + "value= " + node.getTextContent());

      //  for (int i = 0; i < nodeList.getLength(); i++) {
      //      Node current = nodeList.item(i);
       //     printItems(current);
      //  }

    }
    }



    public List<Enseignant> extractEnseignants(Node node) {
        NodeList eList = node.getChildNodes();
        List<Enseignant> ensList=new ArrayList<Enseignant>();
        for (int i = 0; i < eList.getLength(); i++) {
            Node current = eList.item(i);
            ensList.add(extractEnseignant(current));
        }
        return ensList;
    }


        public Enseignant extractEnseignant(Node node){
        Enseignant enseignant= new Enseignant();
       // System.out.println(node.getChildNodes().item(0).getTextContent());
        enseignant.setNumEns(Integer.parseInt(node.getChildNodes().item(0).getTextContent()));
        enseignant.setNom(node.getChildNodes().item(1).getTextContent());
        enseignant.setPrenom(node.getChildNodes().item(2).getTextContent());
        enseignant.setTelephone(node.getChildNodes().item(3).getTextContent());
        System.out.println(enseignant);

       // enseignant.setNumEns(node.getChildNodes().item(0));
      //  e.setNumEns(Integer.parseInt(eList.item(0).getTextContent()));
      //  System.out.println(Integer.parseInt(eList.item(0).getTextContent()));
        return null;
    }

}


