package com.home_work_1.task_5;

public class Task_5 {

    public static void main(String[] args) {

        int numberOne = 5;
        int numberTwo = -5;
        int numberThree = 7;

        int totalPositive = 0;
        int totalNegative = 0;

        if (numberOne>0)
            totalPositive = totalPositive + 1;

        if (numberTwo>0)
            totalPositive = totalPositive + 1;

        if (numberThree>0)
            totalPositive = totalPositive + 1;

        if (numberOne<0)
            totalNegative = totalNegative + 1;

        if (numberTwo<0)
            totalNegative = totalNegative + 1;

        if (numberThree<0)
            totalNegative = totalNegative + 1;


        System.out.println("Количество положительных чисел равно "+totalPositive);
        System.out.print("Количество отрицательных чисел равно "+totalNegative);
    }
}
