package com.pickles.practice_14.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class task_3 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Nokia", 350d));
        phones.add(new Phone("Alcatel", 200d));
        phones.add(new Phone("Apple", 1000d));
        phones.add(new Phone("Samsung", 900d));
        phones.add(new Phone("Xiaomi", 290d));
        phones.add(new Phone("Siemens", 150d));

        List<String> filteredByName = phones.stream()
                .map(Phone::getName)
                .filter(phone -> "Apple".equals(phone) || "Xiaomi".equals(phone) || "Samsung".equals(phone))
                .collect(Collectors.toList());

        System.out.println(filteredByName);
    }
}