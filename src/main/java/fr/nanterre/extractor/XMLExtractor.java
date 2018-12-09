package fr.nanterre.extractor;

import fr.nanterre.XMLmodel.Cours;
import fr.nanterre.XMLmodel.Enseignant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import fr.nanterre.XMLmodel.Enseignement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Sabrine Nait Ijja
 */
public class XMLExtractor {

    private static final String XML_BD = "src/main/resources/Univ_BD_3.xml";

    /**
     *
     * @return
     */
    public Document init() {
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
        NodeList nodeList = racine.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            printItems(node);
        }
    }

    private void printItems(Node node) {

        if (node.getNodeType() == Node.ELEMENT_NODE) {
            NodeList nodeList = node.getChildNodes();
            if (nodeList.getLength() > 1) {
               // System.out.println("==================" + node.getNodeName() + "[" + nodeList.getLength() + "]======================");
                if (node.getNodeName().equals("Enseignants")) {
                    extractEnseignants(node);
                }
            }
        }
    }



    public List<Enseignant> extractEnseignants(Node node) {
        NodeList eList = node.getChildNodes();
        List<Enseignant> ensList = new ArrayList<Enseignant>();
        for (int i = 0; i < eList.getLength(); i++) {
            Node current = eList.item(i);
            ensList.add(extractEnseignant(current));
        }
        for (Enseignant enseignant : ensList){
            int heures = 0;
            if (enseignant.getEnseignements()!= null){
            for (Enseignement enseignement :enseignant.getEnseignements()) {
                heures += enseignement.getHeures();
            }}
            System.out.println("Le professeur " + enseignant.getNom() + " " + enseignant.getPrenom() + " Enseigne " + heures + " heures");
        }
        return ensList;
    }




    public List<Enseignement> extractEnseignements(Node node) {
        List<Enseignement> enseignements = new ArrayList<Enseignement>();
        NodeList eList = node.getChildNodes();
        if(eList != null)
        for (int i = 0; i < eList.getLength(); i++) {
            Enseignement enseignement = new Enseignement();
            enseignement.setHeures(Integer.parseInt(node.getChildNodes().item(0).getTextContent()));
            enseignement.setAnnee(Integer.parseInt(node.getChildNodes().item(1).getTextContent()));
            enseignement.setCours(extractCours(node.getChildNodes().item(2)));
            enseignements.add(enseignement);
        } else{
            System.out.println("Cet enseignant n'a aucun enseignement enrigistré");
        }
        return enseignements;
    }

    public Cours extractCours(Node node){
        Cours cours =new Cours();
        cours.setId(Integer.parseInt(node.getChildNodes().item(0).getTextContent()));
        return cours;
    }


    public Enseignant extractEnseignant(Node node) {
        Enseignant enseignant = new Enseignant();
        enseignant.setNumEns(Integer.parseInt(node.getChildNodes().item(0).getTextContent()));
        enseignant.setNom(node.getChildNodes().item(1).getTextContent());
        enseignant.setPrenom(node.getChildNodes().item(2).getTextContent());
        enseignant.setTelephone(node.getChildNodes().item(3).getTextContent());
        enseignant.setAdresseMail(node.getChildNodes().item(4).getTextContent());
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            if (node.getChildNodes().item(i).getNodeName().equals("Enseignements")) {
                Node current = node.getChildNodes().item(i).getFirstChild();
                if (current!=null) {
                    enseignant.setEnseignements(extractEnseignements(current));
                }else{
                    enseignant.setEnseignements(null);
                }
            }
        }
        return enseignant;
    }

}


