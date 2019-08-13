package com.pickles.practice_17_2.task_4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task_4_Main  {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Links links = new Links();

        CallableTxtWordsCounter wordsCounter1 = new CallableTxtWordsCounter(Links.getFile1Path());
        CallableTxtWordsCounter wordsCounter2 = new CallableTxtWordsCounter(Links.getFile2Path());
        CallableFileCounter fileCounter = new CallableFileCounter(Links.getSourceFolder());

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Integer> wordsInFirstFile = executorService.submit(wordsCounter1);
        Future<Integer> wordsInSecondFile = executorService.submit(wordsCounter2);
        Future<Integer> filesQuantity = executorService.submit(fileCounter);

        executorService.shutdown();

        System.out.println("Words in the first file: " + wordsInFirstFile.get());
        System.out.println("Words in the second file: " + wordsInSecondFile.get());
        System.out.println("Number of files: " + filesQuantity.get());
    }
}