package com.pickles.practice_17_2.task_3;

import java.util.Scanner;
import java.util.concurrent.*;

public class Task_3 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter the number to find its factorial");

        Integer checkedNumber = scr.nextInt();

        Integer halfNum1 = checkedNumber / 2;
        Integer halfNum2 = checkedNumber / 2 + 1;
        Integer finalResult;

        CallableClass callable1 = new CallableClass(1, halfNum1);
        CallableClass callable2 = new CallableClass(halfNum2, checkedNumber);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> result1 = executorService.submit(callable1);
        Future<Integer> result2 = executorService.submit(callable2);

        executorService.shutdown();

        finalResult = result1.get()*result2.get();
        System.out.println(finalResult);
    }
}

