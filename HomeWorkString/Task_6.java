package com.pickles.practise_9;

import java.util.Arrays;

public class Task_6 {
    private static final String DELIMITER = " ";

    public static void main(String[] args) {
        String text = "While While major gameplay components are already in place and functioning, " +
                "players help is needed to add some of the smaller features and content. " +
                "Of course polishing the overall experience is important at the same time. " +
                "Game has been extensively tested in closed group, but it is always important " +
                "to hear fresh suggestions from larger crowd that come from various gaming backgrounds. " +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        if (text.length() != 0) {

            int counter = 0;
            text = text.replace(".", " ");
//            System.out.println(text);
            String[] array = text.split(" ");
//            System.out.println(Arrays.toString(array));
            String[] array_2 = {"alert", "add", "good", "plan"};


            for (String j : array_2) {
                for (String i : array) {
                    if (i.equals(j)) {
                        counter++;
                    }
                }
                System.out.println(j + " " + counter);
                counter=0;
            }


//            if (indexOfAlert == -1) {
//                System.out.println("String does not include the word \"alert\"");
//            } else if (indexOfNextAlert == -1) {
//                System.out.println("String contains only one word \"alert\"");
//            } else {
//                int indexOfConsecutiveAlert = text.indexOf("While", indexOfNextAlert + 1);
//                for (int i = indexOfConsecutiveAlert; indexOfConsecutiveAlert <= text.length(); indexOfConsecutiveAlert++) {
//                    indexOfNextAlert++;
//                    counter++;
//                }
//                System.out.println(counter);


        }
    }
}


