package com.pickles.practice_10.task_2;

import java.io.*;
import java.lang.String;

public class Task_2 {
    private static final String TEXT = "M";
    private static final String LINK = "C:\\Users\\Tsyplik\\IdeaProjects\\Java-core\\src\\com\\pickles\\practice_10\\task_2\\textEntered.txt";

    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(LINK);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
            for (int i = 0; i < 1_000_000; i++) {
                bufferedOutputStream.write(TEXT.getBytes());
                bufferedOutputStream.write('\n');
            }
            bufferedOutputStream.flush();
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("File not found");
        } catch (IOException ioException) {
            System.out.println("IO Exception");
        } catch (OutOfMemoryError outOfMemory) {
            System.out.println("Out of memory");
        }
    }
}