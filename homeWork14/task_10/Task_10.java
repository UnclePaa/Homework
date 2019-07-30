package com.pickles.practice_14.task_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_10 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone ("Apple", 3));
        phones.add(new Phone("Nokia", 5));
        phones.add(new Phone("Samsung", 4));
        phones.add(new Phone("Xiaomi", 7));

        // не забывай удалять ненужное
        Map<ArrayList<String>, ArrayList<Integer>> phoneMap = new HashMap<>();

        Map<String, Integer> phoneHashMap = phones.stream()
            // Collectors.summingInt(Phone::getPrice))); в качестве ключа. Попробуй добавить одинаковых и сумма с твоим вариантом не изменится
                .collect(Collectors.toMap(Phone::getName, Phone::getQuantity));

        System.out.println(phoneHashMap);
        Integer appleQuantity = phoneHashMap.get("Apple");
        System.out.println("Apple devices quantity: " + appleQuantity);
    }
}
