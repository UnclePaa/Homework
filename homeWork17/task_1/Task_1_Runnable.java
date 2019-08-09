package com.pickles.practice_17.task_1;

//+, можно было обойтись 1 аргументом конструктора, но это не важно.
public class Task_1_Runnable implements Runnable {
    private int counter;
    private int number;

    public Task_1_Runnable(int counter, int number) {
        this.counter = counter;
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < counter; i++) {
            number++;
            System.out.println(number);
        }
    }
}

