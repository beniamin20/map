package model;

public abstract class TaskRunnerDecorator implements TaskRunner {
    private TaskRunner task;

    public TaskRunner getTask() {
        return task;
    }

    public void setTask(TaskRunner task) {
        this.task = task;
    }

    public TaskRunnerDecorator(TaskRunner task) {
        this.task = task;
    }
}
