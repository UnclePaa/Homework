package com.pickles.practice_11.task_1;

public class Task_1<E> {

    private E unknownVar;

    public Task_1(E unknownVar) {
        this.unknownVar = unknownVar;
    }

    public E getUnknownVar() {
        return unknownVar;
    }

    public void getType() {
        System.out.println(unknownVar.getClass().getName());
    }


    public static void main(String[] args) {
        Task_1<Integer> showType = new Task_1<>(1);
        showType.getType();
    }
}


