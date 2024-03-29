package com.pickles.practice_14.task_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Phone - ты постоянно копируешь в каждую таску, не надо. Создай пакет entity и туда помести свой класс Phone один для всех тасок
public class Task_8 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Nokia", 350d));
        phones.add(new Phone("Alcatel", 200d));
        phones.add(new Phone("Apple", 1000d));
        phones.add(new Phone("Motorola", 300d));
        phones.add(new Phone("Samsung", 900d));
        phones.add(new Phone("Xiaomi", 290d));
        phones.add(new Phone("Siemens", 150d));

        // ты отсортировал, а нужно было сгруппировать. 
        // .collect(Collectors.groupingBy...) в лекции это было
        List<Phone> sortedByProducer = phones.stream()
                .sorted(Comparator.comparing(Phone::getName))
                .collect(Collectors.toList());

        System.out.println(sortedByProducer);
    }
}
