package com.pickles.practice_15.task_3;

import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
        List<Integer> firstIntList = new ArrayList<>();
        firstIntList.add(1);
        firstIntList.add(2);
        firstIntList.add(3);

        List<Integer> secondIntList = new ArrayList<>();
        secondIntList.add(4);
        secondIntList.add(5);
        secondIntList.add(6);

        Map<String, List<Integer>> firstMap = new HashMap<>();
        firstMap.put("First", firstIntList);

        Map<String, List<Integer>> secondMap = new HashMap<>();
        secondMap.put("First", secondIntList);

        firstMap.forEach((key, value) -> secondMap.merge( key, value, (v1, v2) -> {
            List<Integer> merged = new ArrayList<>(v1);
            merged.addAll(v2);
            return merged;
        }));
        System.out.println(secondMap);

    }
}
