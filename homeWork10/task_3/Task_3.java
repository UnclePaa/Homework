package com.pickles.practice_10.task_3;

import java.io.*;

public class Task_3 {
    private static final String FILE_PATH = "C:\\Users\\Tsyplik\\IdeaProjects\\Java-core\\" +
            "src\\com\\pickles\\practice_10\\task_2\\textEntered.txt";

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(FILE_PATH);
             BufferedReader bufferedreader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedreader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("File not found");
        } catch (IOException IOException) {
            System.out.println("IO Exception");
        } catch (OutOfMemoryError outOfMemoryError) {
            System.out.println("Out of memory");
        }
    }
}
