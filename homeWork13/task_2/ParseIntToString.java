package com.pickles.practice_13.task_2;

import java.util.function.Function;

public class ParseIntToString {
    public static void main(String[] args) {
        Function<Integer, String> intParseToString = (number) -> "USD " + String.valueOf(number);
        String result = intParseToString.apply(1_000_000);
        System.out.println(result);
    }
}
