package com.home_work_1.task_4;

public class Task_4 {

    public static void main(String[] args) {

        int numberOne = 5;
        int numberTwo = 5;
        int numberThree = 7;

        int totalPositive = 0;

            if (numberOne>0)
                totalPositive = totalPositive + 1;

            if (numberTwo>0)
                totalPositive = totalPositive + 1;

            if (numberThree>0)
                totalPositive = totalPositive + 1;


            System.out.print("Количество положительных чисел равно "+totalPositive);

    }

}
