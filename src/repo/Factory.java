package repo;

import model.Strategy;

/**
 * Created by benipater on 04/10/2017.
 */

public interface Factory {

    Container createContainer(Strategy type);
}
