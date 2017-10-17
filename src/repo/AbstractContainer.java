package repo;

import model.AbstractTask;
import model.TaskArray;

public abstract class AbstractContainer implements Container {
    protected TaskArray array;

    public TaskArray getArray() {
        return array;
    }

    public void setArray(TaskArray array) {
        this.array = array;
    }

    public AbstractContainer(TaskArray array) {
        this.array = array;
    }

    public AbstractContainer() {
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
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        if (array.size() >= 1) {
            return  false;
        }
        return true;
    }
}
