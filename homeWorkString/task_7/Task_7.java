package com.pickles.homeWorkString.task_7;

import java.util.Date;

public class Task_7 {
    public static void main(String[] args) {
        Date forString = new Date();
        long forStringCurrent = forString.getTime();
        String stringTest = "La";
        for (int i = 0; i < 10000; i++) {
            stringTest = stringTest.concat(" La ");
        }
        Date forString_2 = new Date();
        long forStringLatest = forString_2.getTime();

        System.out.println("Для \"String\" процесс присоединения строк занял " + (forStringLatest - forStringCurrent) + " м/сек.");

        Date forStringBuilder = new Date();
        long forStringBuilderCurrent = forStringBuilder.getTime();
        StringBuilder stringForStrBldr = new StringBuilder("La");
        String stringBuilderTest = " La ";
        for (int j = 0; j < 10000; j++) {
            stringForStrBldr.append(stringBuilderTest);
        }
        Date forStrBldr_2 = new Date();
        long forStringBuilderLatest = forStrBldr_2.getTime();
        System.out.println("Для \"StringBuilder\" процесс присоединения строк занял " + (forStringBuilderLatest - forStringBuilderCurrent) + "м/сек.");

        Date forStrBuffer = new Date();
        long forStrBufferCurrent = forStrBuffer.getTime();
        StringBuffer stringForStrBuffer = new StringBuffer("La");
        String stringBufferTest = " La ";
        for (int k = 0; k < 10000; k++) {
            stringForStrBuffer.append(stringBufferTest);
        }
        Date forStrBuffer_2 = new Date();
        long forStrBuffLatest = forStrBuffer_2.getTime();
        System.out.println("Для \"StringBuffer\" процесс присоединения строк занял " + (forStrBuffLatest - forStrBufferCurrent) + "м/сек.");

    }
}
