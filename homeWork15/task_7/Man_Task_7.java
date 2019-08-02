package com.pickles.practice_15.task_7;

public class Man_Task_7 {
    private String name;
    private String surname;
    private Long phoneNum;

    public Man_Task_7(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Man_Task_7(String name, Long phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public Man_Task_7(String name, String surname, Long phoneNum) {
        this(name, phoneNum);
        this.surname = surname;
    }
}