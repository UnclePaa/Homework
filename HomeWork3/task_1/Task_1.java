package home_work_3.task_1;

import java.util.*;


public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int i = 0;
        int j = 2;
        while (i < 10) {
            array[i] = j;
            j += 2;
            i++;
        }
        String finalArr = Arrays.toString(array);
        System.out.println(finalArr); //для проверки корректности формирования массива

        for (i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
