package home_work_3.task_8;


import java.util.Arrays;
import java.util.*;

public class Task_8 {
    public static void main(String[] args) {
        int[] arrayOne = new int[10];
        int[] arrayTwo = new int[10];
        double[] arrayThree = new double[10];
        int l = 0;
        for (int i = 0; i < 10; i++) {
            arrayOne[i] = (int) (Math.random() * 9);
            arrayTwo[i] = (int) (Math.random() * 9);
            double j = arrayOne[i];
            double k = arrayTwo[i];
            arrayThree[i] = j / k;
            if (Math.round(arrayThree[i]) == (arrayThree[i])) {
                l++;
            }
        }
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));
        System.out.println("Количество целых чисел в третьем массиве = " + l);
    }

}
