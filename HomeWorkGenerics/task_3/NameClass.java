package com.pickles.practice_11.task_3;

public class NameClass<T> implements ClassName<T> {
    private T className;

    public static void main(String[] args) {
        NameClass<String> firstClassName = new NameClass<>("C26 Java");
        NameClass<Integer> secondClassName = new NameClass<>(26);
        firstClassName.showClassName();
        secondClassName.showClassName();
    }

    public NameClass(T className) {
        this.className = className;
    }

    public T getClassName() {
        return className;
    }

    @Override
    public <T> void showClassName() {
        System.out.println("Class name is " +className);
    }
}
