package com.pickles.practice_14.task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task_9 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Nokia", 350d));
        phones.add(new Phone("Alcatel", 200d));
        phones.add(new Phone("Apple", 1000d));
        phones.add(new Phone("Apple", 790d));
        phones.add(new Phone("Motorola", 300d));
        phones.add(new Phone("Samsung", 900d));
        phones.add(new Phone("Xiaomi", 290d));
        phones.add(new Phone("Siemens", 150d));

        Set<Phone> appleList = phones.stream()
                .filter(name -> name.getName() != null && name.getName().equals("Apple"))
                .collect(Collectors.toSet());

        System.out.println("apple list = " + "\n" + appleList + "\n");

        Set<Phone> withoutAppleList = phones.stream()
                .filter(name -> name.getName() != null && name.getName() != "Apple")
                .collect(Collectors.toSet());

        System.out.println("without apple list = " + "\n" + withoutAppleList + "\n");
    }
}