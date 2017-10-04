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
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
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
