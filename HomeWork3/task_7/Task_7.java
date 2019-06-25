package home_work_3.task_7;

import java.util.*;
//+
public class Task_7 {
    public static void main(String[] args) {

        int[] array = new int[12];
        int i = 0;
        while (i < array.length) {
            array[i] = (int) (Math.random() * 15);
            i++;
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int position = 0;
        {
            for (i = 0; i < array.length; i++) {
                int cell = array[i];
                if (max < cell) {
                    max = cell;
                    position = i;
                }
            }
            System.out.println("Наибольшее значение массива - " + max);
            System.out.println("Индекс последнего вхождения наибольшего числа в массив - " + position);
        }
    }
}
