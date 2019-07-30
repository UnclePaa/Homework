package com.pickles.practice_14.task_1;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car name is " + name;
    }
}
