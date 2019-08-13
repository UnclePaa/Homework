package com.pickles.practice_17_2.task_2;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class List_Task_2 {
    private ArrayList<Integer> intList = new ArrayList<>();

    public void addNumberToList(int n) {
        intList.add(n);
    }

    public void defineAverage() {
        OptionalDouble findAverage = intList.stream().mapToInt(Integer::intValue).average();
        if (findAverage.isPresent()) {
            System.out.println(findAverage);
        }
    }

    @Override
    public String toString() {
        return "intList= " + intList;
    }
}