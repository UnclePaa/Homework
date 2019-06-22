package home_work_3.task_4;

import java.util.Arrays;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        int[] arrayRandom = new int[20];
        int i = 0;
        while (i < 20) {
            arrayRandom[i] = (int) (Math.random() * 99);
            i++;
        }
        String arr = Arrays.toString(arrayRandom);
        System.out.print(arr);
        System.out.println("");

        {
            for (i = 0; i < 20; i++) {
                System.out.print(arrayRandom[i] + " ");
            }
            System.out.println("");
            for (i = 0; i < 20; i++) {
                if (arrayRandom[i] % 2 == 1) {
                    arrayRandom[i] = 0;
                }
                System.out.print(arrayRandom[i] + " ");

            }
        }
    }
}


