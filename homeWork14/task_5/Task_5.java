package com.pickles.practice_14.task_5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task_5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(16, 7, 11, 9, 5, 190, 10);

        // multiplyFirstFiveElem -> result. Не привязывай название переменной к действиям внутри
        Optional<Integer> multiplyFirstFiveElem = numbers.stream()
                .limit(5)
                .reduce((x, y) -> x * y);

        System.out.println("The result of the multiplication of the first five elements is " + multiplyFirstFiveElem.get());
    }
}
