package com.pickles.practice_12.task_4;

import java.util.ArrayList;
import java.util.List;

public class RetainTheSameElem {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();
        fillTheFirstList(firstList);
        fillTheSecondList(secondList);
        retainTheSame(firstList, secondList);
    }

    private static void fillTheFirstList(List<String> firstList) {
        firstList.add("Bob");
        firstList.add("John");
        firstList.add("Laura");
        firstList.add("Antony");
        System.out.println("The first list contains " + firstList);
    }

    private static void fillTheSecondList(List<String> secondList) {
        secondList.add("George");
        secondList.add("John");
        secondList.add("Antony");
        secondList.add("Johann");
        System.out.println("The second list contains " + secondList);
    }

    // печать листа надо убрать из метода,  здесь одна строчка, можно не выносить в отдельный
    private static void retainTheSame(List<String> firstList, List<String> secondList) {
        firstList.retainAll(secondList);
        System.out.println(firstList);
    }
}
