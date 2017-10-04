package repo;

import model.Strategy;

/**
 * Created by benipater on 04/10/2017.
 */


public class TaskContainerFactory implements Factory {
    private static final TaskContainerFactory instance = new TaskContainerFactory();

    private TaskContainerFactory() {
    }

    public static TaskContainerFactory getInstance() {
        return instance;
    }

    @Override
    public Container createContainer(Strategy type) {

        if(type == Strategy.FIFO) {
            return new QueueContainer();

        } else if(type == Strategy.LIFO) {
            return  new StackContainer();
        }

        return null;
    }
}
