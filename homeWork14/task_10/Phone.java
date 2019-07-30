package com.pickles.practice_14.task_10;

public class Phone {
    private String name;
    private Integer quantity;

    public Phone(String name, Integer price) {
        this.name = name;
        this.quantity = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " for " + quantity + "\n";
    }
}