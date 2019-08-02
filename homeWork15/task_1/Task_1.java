package com.pickles.practice_15.task_1;

import java.util.Scanner;

public class Task_1 {
    private static final String GREETINGS = "Hello, my name is %s. I'm %s developer " +
            "and I'm glad to become a part of your company.";

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scr.next();

        System.out.println("Please enter programming language");
        String language = scr.next();

        greetingsResult(GREETINGS,name,language);
    }

    static void greetingsResult (String sentenceToFormat, String enteredName, String enteredLanguage) {
        String finalString = String.format(sentenceToFormat, enteredName, enteredLanguage);
        System.out.println(finalString);
    }
}