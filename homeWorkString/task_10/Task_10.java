package com.pickles.homeWorkString.task_10;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner firstWord = new Scanner(System.in);
        Scanner secondWord = new Scanner(System.in);
        System.out.println("Введите первое слово с четным количеством символов");
        String first = firstWord.nextLine();
        if (first.length()%2==1) {
            System.out.println("Вы ввели слово с нечетным количеством символов. Попробуйте снова");
            firstWord.nextLine();
        }
        System.out.println("Введите второе слово с четным количеством символов");
        String second = secondWord.nextLine();
        if (second.length()%2==1) {
            System.out.println("Вы ввели слово с нечетным количеством символов. Попробуйте снова");
        secondWord.nextLine();
        }
        String finalFirst = first.substring(0, first.length()/2);
        String finalSecond = second.substring(second.length()/2);
        System.out.print(finalFirst+finalSecond);


    }
}
