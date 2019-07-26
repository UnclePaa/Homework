package com.pickles.practice_13.task_7;
//TODO
import org.w3c.dom.NameList;

import javax.naming.Name;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MyComparatorMain {
    public static void main(String[] args) {
        List<NamesList> persons = new LinkedList<>();
        persons.add(new NamesList("Jack", 1));
        persons.add(new NamesList("Laura", 2));
        persons.add(new NamesList("Bob", 3));
        persons.add(new NamesList("Carl", 4));
        persons.add(new NamesList("Jennifer", 5));
        persons.add(new NamesList("Ethan", 6));
        persons.add(new NamesList("Rob", 7));
        persons.add(new NamesList("Robert", 8));
        System.out.println(persons);

        compare(persons);
        List<String> comparedList = new LinkedList<>();
        
        /*
        Comparator<String> descendingComparator = Comparator.reverseOrder();
        comparedList.sort(descendingComparator);
        */
        System.out.println(persons);
    }

    private static void compare(List<NamesList> listToCompare) {
        Comparator<NamesList> comparator = Comparator.comparing(NamesList::getId);
        comparator.reversed();
    }
}
