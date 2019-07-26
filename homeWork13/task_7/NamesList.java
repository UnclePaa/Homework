package com.pickles.practice_13.task_7;

import java.util.List;

// название класса NameList, но это совсем не лист
public class NamesList {
    private String name;
    private int id;

    public NamesList(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name: " + name + ", id " + id;
    }
}
