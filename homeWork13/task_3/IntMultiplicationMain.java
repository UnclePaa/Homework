package com.pickles.practice_13.task_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntMultiplicationMain {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        try {
            System.out.println("Please enter the first integer");
            Integer number1 = scr.nextInt();
            System.out.println("Please enter the second integer");
            Integer number2 = scr.nextInt();
                Result result = new Result(number1, number2);
                result.result(number1, number2);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("The entered data is not an integer");
        }
    }
}