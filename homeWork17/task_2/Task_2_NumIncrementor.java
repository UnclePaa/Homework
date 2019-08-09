package com.pickles.practice_17.task_2;

public class Task_2_NumIncrementor implements Runnable {
    private int counter;
    private int number;

    public Task_2_NumIncrementor(int counter, int number) {
        this.counter = counter;
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < counter; i++) {
            number++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interExc) {
                interExc.printStackTrace();
            }
            System.out.println(number);
        }
    }
}