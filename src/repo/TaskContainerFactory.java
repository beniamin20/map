package repo;

import model.Strategy;

/**
 * Created by benipater on 04/10/2017.
 */
public class TaskContainerFactory implements Factory {


    @Override
    public Container createContainer(Strategy type) {

        if(type == Strategy.FIFO) {
            // return a fifo

        } else if(type == Strategy.LIFO) {
            // return a lifo
        }

        return null;
    }
}
