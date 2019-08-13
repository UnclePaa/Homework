package com.pickles.practice_17_2.task_3;

import java.util.concurrent.Callable;

public class CallableClass implements Callable {
    private int defValue;
    private int num;

    public CallableClass(int defValue, int num) {
        this.defValue = defValue;
        this.num = num;
    }

    @Override
    public Integer call() {
        int result = 1;
        for (int i = defValue; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}