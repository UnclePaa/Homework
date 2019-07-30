package com.pickles.practice_14.task_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task_7 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Nokia", 350d));
        phones.add(new Phone("Alcatel", 200d));
        phones.add(new Phone("Apple", 1000d));
        phones.add(new Phone("Samsung", 900d));
        phones.add(new Phone("Xiaomi", 290d));
        phones.add(new Phone("Siemens", 150d));

        Optional<Phone> min = phones.stream()
                .min(Comparator.comparing(Phone::getPrice));

        System.out.println("The cheapest phone is " + min.get());
    }
}