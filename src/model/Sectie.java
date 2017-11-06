package model;

import repository.HasID;

public class Sectie implements HasID<ID> {
    private ID id;
    private String nume;
    private int nrLoc;

    public Sectie(ID id, String nume, int nrLoc) {
        this.id = id;
        this.nume = nume;
        this.nrLoc = nrLoc;
    }

    public Sectie() {
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

    @Override
    public ID getId() {
        return null;
    }

    @Override
    public void setId(ID id) {

    }

}
