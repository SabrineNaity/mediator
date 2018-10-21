package fr.nanterre.model;

public class Inscription {
    private Etudiant etudiant;
    private Cours cours;
    private int annee;
    private int note;

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

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Inscription{" +
                "etudiant=" + etudiant +
                ", cours=" + cours +
                ", annee=" + annee +
                ", note=" + note +
                '}';
    }
}
