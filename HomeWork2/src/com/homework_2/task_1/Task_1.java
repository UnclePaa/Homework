package com.homework_2.task_1;

public class Task_1 {

    public static void main (String[] args) {

        double startDay = 10;
        double everyDay = 10;
        int dayCount;

        for (dayCount = 1; dayCount < 7; dayCount++) {
            startDay*=1.1;
            everyDay+=startDay;}

            System.out.println("За 7 дней спортсмен пробежит " + everyDay +" км");
        }
    }
