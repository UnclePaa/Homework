package com.pickles.homeWorkString.task_8;

import java.lang.String;

public class Task_8 {
    public static void main(String[] args) {
        String[][] carStorage = {{"Audi", "1.4"}, {"BMW", "1.8"}};
        for (int i = 0; i < carStorage.length; i++) {
            for (int j = 0; j < carStorage[i].length; j++) {
                System.out.print(carStorage[i][j] + " \t");
            }
            System.out.println();
        }
    }
}
// TODO: 05.07.2019  