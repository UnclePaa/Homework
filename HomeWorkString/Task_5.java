package com.pickles.practise_9;

import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        String colors = "Green. red. blue. yellow";
        char[] toArray = colors.toCharArray();
        for (int i = 0; i < toArray.length; i++) {
            if(toArray[i] == '.')
            {
                toArray[i] = ',';
            }
        }

        System.out.println(toArray);
    }



}
