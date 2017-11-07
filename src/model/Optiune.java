package model;

public class Optiune {
    private ID idOptiune;
    private ID idCandidat;
    private Sectie sectie;

    public Optiune(ID idOptiune, ID idCandidat, Sectie sectie) {
        this.idOptiune = idOptiune;
        this.idCandidat = idCandidat;
        this.sectie = sectie;
    }

    public Optiune() {
    }

    public ID getIdOptiune() {
        return idOptiune;
    }

    public void setIdOptiune(ID idOptiune) {
        this.idOptiune = idOptiune;
    }

    public ID getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(ID  idCandidat) {
        this.idCandidat = idCandidat;
    }

    public Sectie getSectie() {
        return sectie;
    }

    public void setSectie(Sectie sectie) {
        this.sectie = sectie;
    }
}
