package repo;

import model.AbstractTask;
import model.TaskArray;

/**
 * Created by benipater on 04/10/2017.
 */

public class QueueContainer implements Container {
    private TaskArray array;

    public QueueContainer() {
    }

    public QueueContainer(TaskArray array) {
        this.array = array;
    }

    public TaskArray getArray() {
        return array;
    }

    public void setArray(TaskArray array) {
        this.array = array;
    }

    @Override
    public AbstractTask remove() {
        int size = array.size() - 1;
        array.delete(size);
        return null;
    }

    @Override
    public void add(AbstractTask task) {
        array.add(0, task);
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
