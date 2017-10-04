package repo;
import model.AbstractTask;

/**
 * Created by benipater on 04/10/2017.
 */

public interface Container {

    AbstractTask remove();
    void add(AbstractTask task);
    int size();
    boolean isEmpty();

}
