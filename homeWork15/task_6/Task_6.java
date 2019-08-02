package com.pickles.practice_15.task_6;

import java.util.*;
import java.util.stream.IntStream;

public class Task_6 {
    public static void main(String[] args) {
        int[] arrayOne = {1, 4, 5};
        int[] arrayTwo = {0, 2, 3};

        int[] result = mergedAndSortedArray(arrayOne, arrayTwo);

        System.out.println("mergedArray = " + Arrays.toString(result));
    }

    private static int[] mergedAndSortedArray(int[] arr1, int[] arr2) {
        int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        return mergedArray;
    }
}

