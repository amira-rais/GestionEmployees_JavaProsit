package tn.esprit.entities;

public class Departement implements Comparable <Departement> {
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    public Departement() {
        this.id = 0 ;
    }
    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return id == ((Departement) o).getId() && nomDepartement.equals(((Departement) o).getNomDepartement());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + id;
        hash = 89 * hash + nomDepartement.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return "Departement : " + "id=" + id + ", nomDepartement = " + nomDepartement + ", nombreEmployes = " + nombreEmployes;
    }

    @Override
    public int compareTo(Departement o) {
        return this.id - o.getId();
    }
}
