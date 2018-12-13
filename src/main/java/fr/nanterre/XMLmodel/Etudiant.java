package fr.nanterre.XMLmodel;

import java.util.List;

public class Etudiant {
    private int id;
    private String nom;
    private String telephone;
    private String provenance;
    private String formationPrecedente;
    private String paysFormationPrecedente;
    private int anneeDebut;
    private String dateNaissance;
    private String niveauInsertion;
    private List<Inscription> inscriptions;

    public Etudiant() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public String getFormationPrecedente() {
        return formationPrecedente;
    }

    public void setFormationPrecedente(String formationPrecedente) {
        this.formationPrecedente = formationPrecedente;
    }

    public String getPaysFormationPrecedente() {
        return paysFormationPrecedente;
    }

    public void setPaysFormationPrecedente(String paysFormationPrecedente) {
        this.paysFormationPrecedente = paysFormationPrecedente;
    }

    public int getAnneeDebut() {
        return anneeDebut;
    }

    public void setAnneeDebut(int anneeDebut) {
        this.anneeDebut = anneeDebut;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNiveauInsertion() {
        return niveauInsertion;
    }

    public void setNiveauInsertion(String niveauInsertion) {
        this.niveauInsertion = niveauInsertion;
    }

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", provenance='" + provenance + '\'' +
                ", formationPrecedente='" + formationPrecedente + '\'' +
                ", paysFormationPrecedente='" + paysFormationPrecedente + '\'' +
                ", anneeDebut=" + anneeDebut +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", niveauInsertion='" + niveauInsertion + '\'' +
                ", inscriptions=" + inscriptions +
                '}';
    }
}
