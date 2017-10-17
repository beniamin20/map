package model;

public abstract class TaskRunnerDecorator implements TaskRunner {
    private TaskRunner task;

    public TaskRunnerDecorator(TaskRunner task) {
        this.task = task;
    }

    public TaskRunnerDecorator() {

    }

    @Override
    public void executeOneTask() {
        task.executeOneTask();
    }

    @Override
    public void executeAll() {
        task.executeAll();
    }

    @Override
    public boolean hasTask() {
        if(task != null) {
            return true;
        }

        return false;
    }

    @Override
    public void addTask(AbstractTask t) {
        //
    }


}
