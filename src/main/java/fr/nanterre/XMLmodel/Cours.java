package fr.nanterre.XMLmodel;

public class Cours {
    private int id;
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


    public String getType() {
        return type;
    }

    public void setType(String typeType) {
        this.type = typeType;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveauType) {
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
        return "CoursXML{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", niveau='" + niveau + '\'' +
                ", heures=" + heures +
                '}';
    }
}
