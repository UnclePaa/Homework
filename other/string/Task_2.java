package com.pickles.practise_9;

import java.lang.String;

public class Task_2 {
    public static void main(String[] args) {
        String engineering = "Engineering";
        System.out.println("The word is " + engineering);
        String engine = "Engine";
        String ring = "ring";
        int indexOfEngine = engineering.indexOf(engine);
        System.out.println("The word \"Engine\" is found and starting from " + indexOfEngine + " index");
        System.out.println(engineering.lastIndexOf(engine));
        int indexOfEngineCheck = engineering.indexOf(engine, 1);
        System.out.println("Another \"Engine\" in the String (\"-1\" means NO)" + " - " +indexOfEngineCheck);
        System.out.println();
        int indexOfRing = engineering.indexOf(ring);
        System.out.println("The word \"ring\" is found and starting from " + indexOfRing + " index");
        System.out.println();
        int indexOfRingCheck = engineering.indexOf(ring, 8);
        System.out.println("Another \"ring\" in the String (\"-1\" means NO)" + " - " +indexOfRingCheck);
        System.out.println();
        System.out.println(engineering.substring(0,6)+ " " + engineering.substring(7));
    }
}
