package com.pickles.practice_10.task_1;

import java.io.*;
import java.util.Arrays;

public class Task_1 {
    private static final String FILE_PATH = "C:\\Users\\Tsyplik\\IdeaProjects\\Java-core\\src\\com\\pickles\\practice_10\\task_1\\enteredNumbers.txt";
int u;
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));

        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH)) {
            for (int i = 0; i < numbers.length; i++) {
                int y = numbers[i];
                fileOutputStream.write(y);
                fileOutputStream.write(' ');
            }
            fileOutputStream.flush();
        } catch (FileNotFoundException f) {
            System.out.println("File not found");
        } catch (IOException o) {
            System.out.println("IOException");
        }
        try (FileInputStream fileInputStream = new FileInputStream(FILE_PATH)) {
            int o;
            while ((o = fileInputStream.read()) != -1) {
                System.out.println(o);
            }
        } catch (FileNotFoundException g) {
            System.out.println("File not found");
        } catch (IOException k) {
            System.out.println("IO Exception");
        }
    }
}