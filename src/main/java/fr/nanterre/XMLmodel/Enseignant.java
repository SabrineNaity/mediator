package fr.nanterre.XMLmodel;

import java.util.List;

public class Enseignant {
    private int numEns;
    private String nom;
    private String prenom;
    private String telephone;
    private String adresseMail;
    private List<Enseignement> enseignements;

    public Enseignant() {
        super();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getNumEns() {
        return numEns;
    }

    public void setNumEns(int id) {
        this.numEns = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public List<Enseignement> getEnseignements() {
        return enseignements;
    }

    public void setEnseignements(List<Enseignement> enseignements) {
        this.enseignements = enseignements;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "numEns=" + numEns +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresseMail='" + adresseMail + '\'' +
                ", enseignements=" + enseignements +
                '}';
    }
}
