package com.pickles.practice_17.task_1;

public class Task_1_Main {
    public static void main(String[] args) {
        Task_1_Runnable numIncrementor = new Task_1_Runnable(10, 0);

        Thread thread = new Thread(numIncrementor);
        thread.start();
    }
}
