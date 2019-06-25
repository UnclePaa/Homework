package home_work_3.task_9;

import java.util.*;

public class Task_9 {
    public static void main(String[] args) {

        System.out.println("Пожалуйста, укажите размер массива (положительное число)");
        Scanner scr = new Scanner(System.in);
        int entered = scr.nextInt();
        
        // не стоит завершать программу, если ввели неверное число. Сделай цикл, в котором попроси ввести заново
        if (entered < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else {
            int[] array = new int[entered];
            for (int i = 0; i < entered; i++) {
                array[i] = (int) (Math.random() * 15);
            }
            System.out.println(Arrays.toString(array));
           
            // а если пользователь введет 0? будет пустой массив и получишь ошибку
            int l = array[0]; // <- название переменной

            for (int k = 1; k < array.length / 2; k++) {
                l += array[k];
            }
            System.out.println("Сумма элементов первой половины массива = " + l);

            int m = array[array.length / 2]; // <- название переменной
            for (int n = array.length / 2 + 1; n < array.length; n++) {
                m += array[n];
            }
            System.out.println("Сумма элементов второй половины массива = " + m);

            if (l > m) { // <- название переменной
                System.out.println("Сумма ячеек первой половины массива больше суммы второй");
            } else if (l < m) {
                System.out.println("Сумма ячеек второй половины массива больше суммы первой");
            } else {
                System.out.println("Суммы ячеек двух половин массива равны");
            }
        }
    }
}


