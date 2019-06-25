package home_work_3.task_3;

import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        int[] arrayRandom = new int[15];
        int i = 0;
        // arrayRandom.length
        while (i < 15) {
            arrayRandom[i] = (int) (Math.random() * 99);
            i++;
        }
        String arr = Arrays.toString(arrayRandom);
        System.out.println(arr);

        int even = 0;
        
        // arrayRandom.length
        for (i = 0; i < 15; i++) {
            arrayRandom[i] %= 2;
            if (arrayRandom[i] == 0)
                even += 1;
        }
        System.out.println("Количество четных чисел в массиве - " + even);
    }
}




