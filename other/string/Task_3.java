package com.pickles.practise_9;

import java.util.Arrays;

public class Task_3 {
    private static final String STARTS_WITH_SYMBOL = "w";
    private static final String DELIMITER = " ";

    public static void main(String[] args) {
        String[] anyWords = {"Car", "Ring", "Wash", "tree", "wake", "Sum", "wee-wee", "Awaken", "Car-washer"};

        String result = "";

        for (String word : anyWords) {
            if (word.length() > 0) {
                Character firstSymbol = word.charAt(0);
                String stringFirstSymbol = String.valueOf(firstSymbol);
                boolean isEquals = STARTS_WITH_SYMBOL.equalsIgnoreCase((stringFirstSymbol));
                if (isEquals) {
                    result = result + DELIMITER + word;

                }
            }
        }
        result = result.trim();
        String[] filteredWords = result.split(DELIMITER);
        System.out.println(Arrays.toString(filteredWords));
    }
}
