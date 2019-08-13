package com.pickles.practice_17_2.task_2;

public class Task_2_Main {
    public static void main(String[] args) {

        List_Task_2 listTask2 = new List_Task_2();

        listTask2.addNumberToList(2);
        listTask2.addNumberToList(4);
        listTask2.addNumberToList(6);

        System.out.println(listTask2);

        listTask2.defineAverage();
    }
}
