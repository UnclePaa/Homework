package home_work_3.task_5;

import java.util.Arrays;
import java.util.Random;
// Везде используй метод length длины массива. Никогда не используй фикс числа для таких целей.

// Заполнить оба массива можно в одном цикле и сразу же считать среднее.
public class Task_5 {
    public static void main(String[] args) {
        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];
        int i = 0;
        int j = 0;
        {
            while (i < 5) {
                arrayOne[i] = (int) (Math.random() * 15);
                i++;
            }
            String strOne = Arrays.toString(arrayOne);
            System.out.println(strOne);
            {
                // arrayTwo.length
                while (j < 5) {
                    arrayTwo[j] = (int) (Math.random() * 15);
                    j++;
                }
                String strTwo = Arrays.toString(arrayTwo);
                System.out.println(strTwo);
            }
            double sumOne = 0;
            double sumTwo = 0;
            int k = 0;
            int l = 0;
            {
                while (k < 5) {
                    sumOne += arrayOne[k];
                    k++;
                }
                sumOne /= arrayOne.length;
                System.out.println("Среднее значение элементов первого массива = " + sumOne);
            }
            {
                while (l < 5) {
                    sumTwo += arrayTwo[l];
                    l++;
                }
                sumTwo /= arrayTwo.length;
                System.out.println("Среднее значение элементов второго массива = " + sumTwo);
                if (sumOne > sumTwo) {
                    System.out.println("Среднее значение элементов первого массива превышает данный показатель второго массива");
                } else if (sumOne < sumTwo) {
                    System.out.println("Среднее значение элементов второго массива превышает данный показатель первого массива");
                } else {
                    System.out.println("Средние значения показателей обоих массивов равны");
                }
            }

        }
    }
}
