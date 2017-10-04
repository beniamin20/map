package model;

/**
 * Created by benipater on 03/10/2017.
 */

public class TaskArray extends SortingTask {
    SortingTask[] vector;

    public TaskArray(SortingTask[] vector) {
        this.vector = vector;
    }

    public SortingTask[] getVector() {
        return vector;
    }

    public void setVector(SortingTask[] vector) {
        this.vector = vector;
    }

    public SortingTask get(int pos) {
        SortingTask posTask = vector[pos];
        return posTask;
    }

    public void add(SortingTask elem) {
        SortingTask[] v = new SortingTask[vector.length + 1];
        System.arraycopy(vector, 0, v, 0, vector.length);
        v[vector.length] = elem;
        setVector(v);
    }

    public void add(int pos, SortingTask elem) {
        SortingTask[] result = new SortingTask[vector.length + 1];

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
        SortingTask[] result = new SortingTask[vector.length - 1];

        for(int i = 0; i < pos; i++) {
            result[i] = vector[i];
        }

        for(int i = pos; i < vector.length - 1; i++) {
            result[i] = vector[i + 1];
        }

        setVector(result);
    }

    public void size() {
        System.out.println(vector.length);
    }

    @Override
    public void execute() {

    }
}
