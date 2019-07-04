package com.pickles.practise_9;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        String[] names = {"Bob", "Carl", "Sonya", "Jessica"};
        String nothing = "";
        for (int i = 0; i < names.length; i++) {
            nothing = nothing + " " + names[i];
        }
        nothing.trim();
        System.out.println(nothing);

    }
}
