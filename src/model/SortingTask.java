package model;

import java.util.Arrays;

/**
 * Created by benipater on 03/10/2017.
 */

public class SortingTask extends AbstractTask {

    public SortingTask() {
    }

    private int[] iArr;

    public int[] getiArr() {
        return iArr;
    }

    public void setiArr(int[] iArr) {
        this.iArr = iArr;
    }

    @Override
    public void execute() {
        // sorting array
        Arrays.sort(iArr);

        for (int no:iArr) {
            System.out.println(no);
        }
    }
}
