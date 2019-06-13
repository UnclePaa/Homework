package com.homework_2.task_2;

public class Task_2 {
    public static void main (String[] args) {

        int coop = 1;
        int hour = 0;

        do {
            System.out.println("За " +hour +" часов количество амебы размножатся до " +coop +" шт.");
                coop*=2;
                hour+=3;
        } while (hour >= 3 && hour <=24);
    }

}
