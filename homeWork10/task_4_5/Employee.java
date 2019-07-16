package com.pickles.practice_10.task_4_5;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    public String name;
    private int age;
    private Boolean work;

    public Employee() {
    }

    public Employee(String name, int age, Boolean work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean getWork() {
        return work;
    }

    @Override
    public String toString() {
        return "My name is " + getName() + ". I'm " + getAge() + " years old.";
    }
}
