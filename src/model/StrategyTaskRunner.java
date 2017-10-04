package model;

import repo.Container;

public class StrategyTaskRunner implements TaskRunner {
    public Container getRepo() {
        return repo;
    }

    public void setRepo(Container repo) {
        this.repo = repo;
    }

    private Container repo;

    public StrategyTaskRunner(Container repo) {
        this.repo = repo;
    }

    @Override
    public void executeOneTask() {

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
