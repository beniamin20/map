package model;

/**
 * Created by benipater on 03/10/2017.
 */

public abstract class AbstractTask {
    private int taskId;

    public AbstractTask(int taskId, String descriere) {
        this.taskId = taskId;
        this.descriere = descriere;
    }

    public AbstractTask() {
    }

    private String descriere;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public abstract void execute();

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", descriere='" + descriere + '\'' +
                '}';
    }
}

