package com.homework_2.task_1;
// code -> reformat code или alt+ctrl+L форматирует код
public class Task_1 {
// пробел не нужен
    public static void main (String[] args) {
// пробел не нужен
        double startDay = 10;
        double everyDay = 10;
        int dayCount;

        for (dayCount = 1; dayCount < 7; dayCount++) {
            startDay*=1.1;
            everyDay+=startDay;} << скобку фигурную на новую строку

            System.out.println("За 7 дней спортсмен пробежит " + everyDay +" км");
        }
    }
