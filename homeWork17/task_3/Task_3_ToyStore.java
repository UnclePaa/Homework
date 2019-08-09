package com.pickles.practice_17.task_3;

public class Task_3_ToyStore {
    // 0 будет присвоен по умолчанию при создании экземпляра класса
    private int numberOfToys = 0;

    public synchronized void put(int counter) {
        for (int i = 0; i < counter; i++) {
            numberOfToys++;
        }
    }

    public void showMeAllStuff() {
        System.out.println(numberOfToys + " toys in your Toy Store at the moment");
    }
}
