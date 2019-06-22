package home_work_3.task_2;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {

        int[] newArray = new int[50];
        int i = 0;
        int j = 1;
        while (i < 50) {
            newArray[i] = j;
            j += 2;
            i++;
        }

        String total = Arrays.toString(newArray);
        System.out.println(total);//для проверки корректности создания массива

        for (i = 0; i <= 49; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println("");
        for (i = 49; i <= 49 & i >= 1; i--) {

            System.out.print(newArray[i] + " ");
        }
    }

}
