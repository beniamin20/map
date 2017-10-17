package model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//  care afişeazǎ un mesaj dupǎ execuţia unui task în care se specificǎ ora la care s-a executat task-ul.

public class PrinterTaskRunner extends TaskRunnerDecorator {

    public PrinterTaskRunner(TaskRunner task) {
        super(task);
    }

    @Override
    public void executeOneTask() {
        decoratedTaskRunner.executeOneTask();
        System.out.println("task executed at "+ new Date().toString());
    }

}
