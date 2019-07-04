package com.home_work_1.task_1;

public class Task_1 {


    public static void main(String[] args) {
        int number = -1234;
        if (number >= 0) {
            System.out.print("Это положительное ");
        } else
            System.out.print("Это отрицательное ");
        if (number < 10 && number > -10) {
            System.out.print("однозначное число");
        } else if (number >= 10 && number < 100 || number > -100 && number <= -10) {
            System.out.print("двухзначное число");
        } else if (number >= 100 && number < 1000 || number <= -100 && number > -1000) {
            System.out.print("трехзначное число");
        } else if (number >= 1000 || number <= -1000) {
            System.out.println("число с количеством знаков 4 и более");
        }

    }

}

// write your code here

