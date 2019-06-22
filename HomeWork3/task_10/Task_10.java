package home_work_3.task_10;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task_10 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число, превышающее число 3");
        int n = scan.nextInt();
        while (n < 4) {
            System.out.println("Введенное число меньше трех");
        }
        int evenArr = 0;
        int[] arrayOne = new int[n];
        for (int i = 0; i < n; i++) {
            arrayOne[i] = (int) (Math.random() * n);
            if (arrayOne[i] % 2 == 0) {
                evenArr++;
            }
        }
        System.out.println(Arrays.toString(arrayOne));

        int[] arrayTwo = new int[evenArr];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (arrayOne[i] % 2 == 0) {
                arrayTwo[pos] = arrayOne[i];
                pos++;
            }
        }
        System.out.println(Arrays.toString(arrayTwo));
    }

}

