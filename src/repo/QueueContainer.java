package repo;

import model.AbstractTask;
import model.TaskArray;
import repo.AbstractContainer;


/**
 * Created by benipater on 04/10/2017.
 */

public class QueueContainer extends AbstractContainer {

    public QueueContainer(TaskArray array) {
        super(array);
    }

    public QueueContainer() {
    }

    @Override
    public TaskArray getArray() {
        return super.getArray();
    }

    @Override
    public void setArray(TaskArray array) {
        super.setArray(array);
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

}
