package com.pickles.practice_12.task_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_RemoveEvenNums {
    public static void main(String[] args) {
        List<Integer> intList = new LinkedList<>();
        fillList(intList);
        removeEven(intList);
    }

    private static void fillList(List<Integer> anyIntList) {
        int item = 0;
        for (int i = 0; i < 100; i++) {
            anyIntList.add(0, item);
            item++;
        }
        System.out.println(anyIntList);
    }

    private static void removeEven(List<Integer> intList) {
        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(intList);
    }
}