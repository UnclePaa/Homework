package com.pickles.practice_17_2.task_1;

import java.util.ArrayList;
import java.util.List;

public class Task_1_Main {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> integerList = new ArrayList<>();

        AddElemToList addElemToList = new AddElemToList();

        Runnable addNewElem = () -> {
            for (int i = 0; i < 20; i++) {
                addElemToList.addNewElem(integerList, (int) (Math.random() * 20 + 1));
            }
            System.out.println(integerList);
        };

        Thread addElement_1 = new Thread(addNewElem);
        Thread addElement_2 = new Thread(addNewElem);

        addElement_1.start();
        addElement_2.start();

        addElement_1.join();
        addElement_2.join();
    }
}
// Move list to AddElemToList Class