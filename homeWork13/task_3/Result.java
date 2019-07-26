package com.pickles.practice_13.task_3;

import java.util.function.BinaryOperator;

public class Result {
    Integer firstNum;
    Integer secondNum;

    public Result(Integer firstNum, Integer secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public Integer getFirstNum() {
        return firstNum;
    }

    public Integer getSecondNum() {
        return secondNum;
    }

    void result(Integer a, Integer b) {
        BinaryOperator<Integer> multiplication = (Integer firstNum, Integer secondNum ) -> a*b;
        Integer result = multiplication.apply(a, b);
        System.out.println("The result of multiplication is " + result);
    }
}
