package repo;
import model.AbstractTask;
import model.TaskArray;

/**
 * Created by benipater on 04/10/2017
 *
 *  LIFO
 *
 */

public class StackContainer extends AbstractContainer {

    public StackContainer(TaskArray array) {
        super(array);
    }

    public StackContainer() {
    }

    @Override
    public AbstractTask remove() {
        array.delete(0);
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
        if(array.size() == 0) {
            return  true;
        }

        return false;
    }
}
