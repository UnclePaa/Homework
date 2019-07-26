package com.pickles.practice_13.task_1;

import java.time.LocalDateTime;

public class Product {
    private String name;
    private int id;
    private LocalDateTime arrivedDate;

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getArrivedDate() {
        return arrivedDate;
    }

    public void setArrivedDate(LocalDateTime arrivedDate) {
        this.arrivedDate = arrivedDate;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", arrivedDate=" + arrivedDate +
                '}';
    }
}
