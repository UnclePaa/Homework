package com.pickles.homeWorkString.task_2;

import java.lang.String;

public class Task_2 {
    public static void main(String[] args) {
        String engineering = "Engineering";
        System.out.println("The word is " + engineering);
        String engine = "Engine";
        String ring = "ring";
        int indexOfEngine = engineering.indexOf(engine);
        System.out.println("The word \"Engine\" is found and starting from " + indexOfEngine + " index");
        
        // зачем тебе этот println?
        System.out.println(engineering.lastIndexOf(engine));
        
        // что такое 1? метод indexOf() перегружен, и есть вариация со смещением, т.е. можно перемещаться по тексту
        // "test".indexOf("что искать", с_какого_индекса)
        int indexOfEngineCheck = engineering.indexOf(engine, 1);
        System.out.println("Another \"Engine\" in the String (\"-1\" means NO)" + " - " +indexOfEngineCheck);
        
        // этот здесь не нужен
        System.out.println();
        
        int indexOfRing = engineering.indexOf(ring);
        System.out.println("The word \"ring\" is found and starting from " + indexOfRing + " index");
        
        // этот здесь не нужен
        System.out.println();
        
        int indexOfRingCheck = engineering.indexOf(ring, 8);
        System.out.println("Another \"ring\" in the String (\"-1\" means NO)" + " - " +indexOfRingCheck);
        
        // этот здесь не нужен
        System.out.println();
        
        // substring(7) - не передавай фикс значения, тем более непонятно что это за цифры такие. 
        // у тебя есть много разных инструментов, например, метод length
        System.out.println(engineering.substring(0,6)+ " " + engineering.substring(7));
    }
}
