package fr.nanterre.model;

public class Cours {
    private int id;
    private String libelle;
    private String type;
    private String niveau;
    private int heures;

    public Cours() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTypeType() {
        return type;
    }

    public void setTypeType(String typeType) {
        this.type = typeType;
    }

    public String getNiveauType() {
        return niveau;
    }

    public void setNiveauType(String niveauType) {
        this.niveau = niveauType;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", type='" + type + '\'' +
                ", niveau='" + niveau + '\'' +
                ", heures=" + heures +
                '}';
    }
}
