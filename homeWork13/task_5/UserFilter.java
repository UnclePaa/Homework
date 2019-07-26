package com.pickles.practice_13.task_5;
// это что?
/* Íå ðàáîòàåò */
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class UserFilter {
    public static void main(String[] args) {
        Predicate<String> startsWithA = (name) -> name.startsWith("A");
        Predicate<String> startsWithP = (name) -> name.startsWith("P");
        Predicate<String> startsWithE = (name) -> name.startsWith("E");

        List<String> users = new LinkedList<>();
        fillListOfNames(users);
        System.out.println("Users list before applying a filter: " + users);

        // программа работает неверно, замени and на or.
        List<String> filteredList = listFilter(users, startsWithA.and(startsWithE.and(startsWithP)));

        System.out.println("Users list after applying a filter " + filteredList);
    }

    private static void fillListOfNames(List<String> names) {
        names.add("Laura");
        names.add("Andy");
        names.add("Bob");
        names.add("Ethan");
        names.add("Jennifer");
        names.add("Penny");
        names.add("Kek");
    }

    private static List<String> listFilter(List<String> names, Predicate<String> namesFilter) {
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (namesFilter.test(name)) {
                names.remove(name);
            }
        }
        return names;
    }
}
