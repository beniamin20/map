package model;

public class Candidat {
    private int id;
    private String nume;
    private String telefon;
    private String mail;
    private int varsta;

    public Candidat(int id, String nume, String telefon, String mail, int varsta) {
        this.id = id;
        this.nume = nume;
        this.telefon = telefon;
        this.mail = mail;
        this.varsta = varsta;
    }

    public Candidat() {
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
