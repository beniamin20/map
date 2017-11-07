package model;

import repository.HasID;

public class Candidat implements HasID<ID> {
    private ID id;
    private String nume;
    private String telefon;
    private String mail;
    private int varsta;

    public Candidat(ID id, String nume, String telefon, String mail, int varsta) {
        this.id = id;
        this.nume = nume;
        this.telefon = telefon;
        this.mail = mail;
        this.varsta = varsta;
    }

    @Override
    public ID getId() {
        return id;
    }

    @Override
    public void setId(ID id) {

    }
}
