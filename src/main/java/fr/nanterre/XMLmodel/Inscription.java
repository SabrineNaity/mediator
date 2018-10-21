package fr.nanterre.XMLmodel;

public class Inscription {
    private Etudiant etudiant;
    private Cours cours;
    private int anneeUniversitaire;
    private int noteCours;

    public Inscription() {
        super();
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public int getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(int anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public int getNoteCours() {
        return noteCours;
    }

    public void setNoteCours(int noteCours) {
        this.noteCours = noteCours;
    }

    @Override
    public String toString() {
        return "InscriptionXML{" +
                "etudiant=" + etudiant +
                ", cours=" + cours +
                ", anneeUniversitaire=" + anneeUniversitaire +
                ", noteCours=" + noteCours +
                '}';
    }
}
