package com.homework_2.task_7;

public class Task_7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i++)
            if (i % 1 != 2) {
                sum += i;
            }
        System.out.println(sum);
    }
}
