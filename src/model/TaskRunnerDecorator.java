package model;

public abstract class TaskRunnerDecorator implements TaskRunner {
    protected TaskRunner decoratedTaskRunner;

    public TaskRunnerDecorator(TaskRunner task) {
        this.decoratedTaskRunner = task;
    }

    public TaskRunnerDecorator() {
    }

    @Override
    public void executeOneTask() {
        decoratedTaskRunner.executeOneTask();
    }

    @Override
    public void executeAll() {
        while (decoratedTaskRunner.hasTask()) {
            executeOneTask();
        }
    }

    @Override
    public void addTask(AbstractTask t) {
        decoratedTaskRunner.addTask(t);
    }

    @Override
    public boolean hasTask() {
        return  decoratedTaskRunner.hasTask();
    }

}
