package model;

/**
 * Created by benipater on 03/10/2017.
 */

public class TaskArray extends SortingTask {
    AbstractTask[] vector;

    public TaskArray(AbstractTask[] vector) {
        this.vector = vector;
    }

    public AbstractTask[] getVector() {
        return vector;
    }

    public void setVector(AbstractTask[] vector) {
        this.vector = vector;
    }

    public AbstractTask get(int pos) {
        AbstractTask posTask = vector[pos];
        return posTask;
    }

    public void add(AbstractTask elem) {
        AbstractTask[] v = new AbstractTask[vector.length + 1];
        System.arraycopy(vector, 0, v, 0, vector.length);
        v[vector.length] = elem;
        setVector(v);
    }

    public void add(int pos, AbstractTask elem) {
        AbstractTask[] result = new AbstractTask[vector.length + 1];

        for(int i = 0; i < pos; i++) {
            result[i] = vector[i];
        }


        for(int i = pos + 1; i < vector.length; i++) {
            result[i] = vector[i - 1];
        }

        result[pos] = elem;
        setVector(result);
    }

    public void delete(int pos) {
        AbstractTask[] result = new AbstractTask[vector.length - 1];

        for(int i = 0; i < pos; i++) {
            result[i] = vector[i];
        }

        for(int i = pos; i < vector.length - 1; i++) {
            result[i] = vector[i + 1];
        }

        setVector(result);
    }

    public int size() {
        System.out.println(vector.length);
        return vector.length;
    }

    @Override
    public void execute() {

    }
}
