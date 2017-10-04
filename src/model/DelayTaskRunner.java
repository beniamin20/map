package model;

public class DelayTaskRunner extends TaskRunnerDecorator {
    public DelayTaskRunner(TaskRunner task) {
        super(task);
    }

    @Override
    public void executeOneTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void executeAll() {

    }

    @Override
    public void addTask(AbstractTask t) {

    }

    @Override
    public boolean hasTask() {
        return false;
    }
}
