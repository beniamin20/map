package model;

public class Sectie {
    private int id;
    private String nume;
    private int nrLoc;

    public Sectie(int id, String nume, int nrLoc) {
        this.id = id;
        this.nume = nume;
        this.nrLoc = nrLoc;
    }

    public Sectie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrLoc() {
        return nrLoc;
    }

    public void setNrLoc(int nrLoc) {
        this.nrLoc = nrLoc;
    }
}
