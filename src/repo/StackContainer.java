package repo;
import model.AbstractTask;
import model.TaskArray;

/**
 * Created by benipater on 04/10/2017
 *
 *  LIFO
 *
 */

public class StackContainer implements Container {
    private TaskArray array;

    public TaskArray getArray() {
        return array;
    }

    public void setArray(TaskArray array) {
        this.array = array;
    }

    @Override
    public AbstractTask remove() {

        return null;
    }

    @Override
    public void add(AbstractTask task) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
