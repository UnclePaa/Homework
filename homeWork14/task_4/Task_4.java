package com.pickles.practice_14.task_4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task_4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(16, 7, 11, 9, 5, 190, 10);

        Optional<Integer> firstNumBiggerThan22 = numbers.stream()
                .filter(number -> number > 22)
                .findFirst();

        System.out.println(firstNumBiggerThan22);
    }
}