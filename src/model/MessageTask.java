package model;

/**
 * Created by benipater on 03/10/2017.
 */

public class MessageTask extends AbstractTask {
    String mesaj;

    public MessageTask(int taskId, String descriere, String mesaj) {
        super(taskId, descriere);
        this.mesaj = mesaj;
    }

    public MessageTask(int taskId, String descriere) {
    }

    public MessageTask(String mesaj) {
        this.mesaj = mesaj;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void execute() {
        System.out.println(mesaj);
    }
}
