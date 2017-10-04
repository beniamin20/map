import model.SortingTask;
import model.Strategy;
import model.TaskArray;
import repo.TaskContainerFactory;

public class Main {

    public static void main(String[] args) {

//        model.MessageTask task = new model.MessageTask(1, "test", "test");
//        task.mesaj = "test";
//        task.execute();
//
//        model.SortingTask sTask = new model.SortingTask();
//        sTask.setiArr(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
//        sTask.execute();


        TaskArray tTask = new TaskArray(new SortingTask[]{new SortingTask()});
        tTask.add(new SortingTask());
        System.out.println(tTask.getVector().length);
        tTask.add(2,new SortingTask());
        tTask.size();
        tTask.delete(1);
        tTask.size();

        TaskContainerFactory container = TaskContainerFactory.getInstance();
        container.createContainer(Strategy.FIFO);
        container.createContainer(Strategy.LIFO);
    }
}