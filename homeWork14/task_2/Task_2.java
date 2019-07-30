package com.pickles.practice_14.task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
//+
public class Task_2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Tratata");
        strings.add("Nrolololofjkbvaskfbhsfjbvh");
        strings.add("Graruajhbaauhrnuankjni");

        Comparator<String> compareByLenght = (x, y) -> Integer.valueOf(x.length()).compareTo(y.length());
        Comparator<String> natural = Comparator.comparing(String::toLowerCase);

        Optional<String> stringWithMaxLength = strings.stream()
                .max(compareByLenght.thenComparing(natural));

        System.out.println("stringWithMaxLength = " + stringWithMaxLength.get());
    }
}
