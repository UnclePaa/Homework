package com.pickles.practice_14.task_8;

public class Phone {
    private String name;
    private Double price;

    public Phone(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " for " + price + "\n";
    }
}