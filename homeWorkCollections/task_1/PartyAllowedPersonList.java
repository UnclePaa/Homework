package com.pickles.practice_12.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartyAllowedPersonList {
    private static final String WELCOME = "Welcome, ";
    private static final String NOT_SO_WELCOME = "Sorry, but you aren't in the list ";


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Please say your name");
        String personWhoWantsTo = scr.next();

        List<String> names = new ArrayList<>(6);
        names.add("Bob");
        names.add("Andy");
        names.add("Laura");
        names.add("Jack");
        names.add("Jennifer");
        names.add("Cindy");

        String message = check(names, personWhoWantsTo);
        System.out.println(message);
    }

    public static String check(List<String> names, String name) {
        if (names.contains(name)) {
            return WELCOME + name;
        } else {
            return NOT_SO_WELCOME + name;
        }
    }
}
