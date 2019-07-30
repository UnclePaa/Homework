package com.pickles.practice_14.task_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_6 {
    public static void main(String[] args) {
        List<String> phones = Arrays.asList("Nokia", "Samsung", "Samsung", "Xiaomi", "Motorola", "Motorola", "Apple", "Apple");

        List<String> distinct = phones.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinct);
    }
}