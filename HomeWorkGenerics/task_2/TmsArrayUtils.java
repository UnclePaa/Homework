package com.pickles.practice_11.task_2;

public class TmsArrayUtils<T> {
    private T[] array;

    public static <T extends Number> double totalSum(T[] array) {
        double sum = 0.0;
        for (T arrayElem : array) {
            sum += arrayElem.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        double sum = TmsArrayUtils.totalSum(new Double[]{1.8, 3.67, 6.6});
        System.out.println(sum);
    }
}
