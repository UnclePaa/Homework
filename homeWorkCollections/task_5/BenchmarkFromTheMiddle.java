package com.pickles.practice_12.task_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkFromTheMiddle {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(100_000);
        List<Integer> linkedList = new LinkedList<>();
        
        fillArrayList(arrayList);
        // название метода fillArrayList а передаешь LinkedList..., не очень
        fillArrayList(linkedList);
        
        deleteFromTheMiddle(arrayList);
        deleteFromTheMiddle(linkedList);
    }

    
    private static void fillArrayList(List<Integer> anyIntList) {
        // такое лучше передавать аргументом метода
        int item = 1;
        
        for (int i = 0; i < 100_000; i++) {
            anyIntList.add(item);
            item++;
        }
    }

    // название метода должно отражать то, что он делает. Т.е. просто удалил и все,  время замеряешь в мейне
    private static void deleteFromTheMiddle(List<Integer> listMiddleDelete) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            listMiddleDelete.remove(listMiddleDelete.size() / 2);
        }
        System.out.println("All items have been removed starting from the middle of " +
                "List in " + (System.nanoTime() - startTime) + "ms");
    }
}
