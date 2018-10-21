package fr.nanterre.model;

public class Enseignement {
    private Enseignant enseignant;
    private Cours cours;
    private int annee;
    private int heures;

    public Enseignement() {
        super();
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
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

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public String toString() {
        return "Enseignement{" +
                "enseignant=" + enseignant +
                ", cours=" + cours +
                ", annee=" + annee +
                ", heures=" + heures +
                '}';
    }
}
