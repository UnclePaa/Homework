package com.pickles.homeWorkString.task_1;


public class Task_1 {
    public static void main(String[] args) {
        String[] names = {"Bob", "Carl", "Sonya", "Jessica"};
        // плохое имя переменной
        String nothing = "";
        for (int i = 0; i < names.length; i++) {
            nothing = nothing + " " + names[i];
        }
        nothing.trim();
        System.out.println(nothing);
// здесь не нужна пустая строка
    }
}
