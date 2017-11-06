package model;

import repository.HasID;

public class Candidat implements HasID<ID> {
    private ID id;
    private String nume;
    private String telefon;
    private String mail;
    private int varsta;

    @Override
    public ID getId() {
        return null;
    }

    @Override
    public void setId(ID id) {

    }
}
