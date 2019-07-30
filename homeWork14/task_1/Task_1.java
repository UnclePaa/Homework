package com.pickles.practice_14.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        List<Car> stringList = new ArrayList<>();
        stringList.add(new Car("Volvo"));
        stringList.add(new Car("Audi"));
        stringList.add(new Car("Moskvich"));
        stringList.add(new Car("KIA"));
        stringList.add(new Car("FIAT"));

        List<Car> removeLessFiveCharName = stringList.stream()
                .filter(car -> car.getName().length() < 5)
                .collect(Collectors.toList());

        System.out.println(removeLessFiveCharName);
    }
}