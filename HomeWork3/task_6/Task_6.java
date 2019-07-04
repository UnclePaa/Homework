package home_work_3.task_6;

import java.util.*;

public class Task_6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        int i = 0;
        while (i < array.length) {
            array[i] = (int) (Math.random() * 10);
            i++;
        }
        String arr1 = Arrays.toString(array);
        System.out.println(arr1);

        boolean ok = true;
        for (i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                ok = false;
            break;
        }
    }
        if (ok) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
// убирай такие абзацы между скобками

    }
}
