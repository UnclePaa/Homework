package com.pickles.practice_17.task_2;

//+
public class Task_2_Main {
    public static void main(String[] args) {

    Task_2_NumIncrementor task_2_numIncrementor = new Task_2_NumIncrementor(20, 0);

    Thread thread = new Thread(task_2_numIncrementor);
    thread.start();

    try {
        thread.join();
    }catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
        }
    }
}
