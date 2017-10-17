package model;

public class Optiune {
    private int idOptiune;
    private int idCandidat;
    private Sectie sectie;

    public Optiune(int idOptiune, int idCandidat, Sectie sectie) {
        this.idOptiune = idOptiune;
        this.idCandidat = idCandidat;
        this.sectie = sectie;
    }

    public Optiune() {
    }

    public int getIdOptiune() {
        return idOptiune;
    }

    public void setIdOptiune(int idOptiune) {
        this.idOptiune = idOptiune;
    }

    public int getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(int idCandidat) {
        this.idCandidat = idCandidat;
    }

    public Sectie getSectie() {
        return sectie;
    }

    public void setSectie(Sectie sectie) {
        this.sectie = sectie;
    }
}
