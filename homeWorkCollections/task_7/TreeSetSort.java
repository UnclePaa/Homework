package com.pickles.practice_12.task_7;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetSort {

    public static void main(String[] args) {
        TreeSet<Integer> simpleNumbers = new TreeSet<>();
        simpleNumbers.add(190);
        simpleNumbers.add(2);
        simpleNumbers.add(77);
        simpleNumbers.add(800);
        simpleNumbers.add(93);
        System.out.println(simpleNumbers);
        reverseTreeSet(simpleNumbers);
        
        // simpleNumbers = reverseTreeSet(simpleNumbers);
    }

    // anyIntSet - IntSet это видно из TreeSet<Integer>
    private static void reverseTreeSet(TreeSet<Integer> anyIntSet) {
        TreeSet<Integer> sortedNumbers;
        sortedNumbers = (TreeSet) anyIntSet.descendingSet();
        System.out.println(sortedNumbers);
    }
    
    /*
    private static TreeSet<Integer> reverseTreeSet(TreeSet<Integer> anyIntSet) {
        return (TreeSet<Integer>) anyIntSet.descendingSet();
    }
    */
}
