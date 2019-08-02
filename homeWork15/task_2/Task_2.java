package com.pickles.practice_15.task_2;

import java.io.*;

public class Task_2 implements Serializable {
    private static final String FIRST_FILE_PATH = "C:\\Users\\Tsyplik\\IdeaProjects\\Java-core\\src\\com\\pickles\\practice_15\\task_2\\TextFile.txt";
    private static final String NEW_FILE_PATH = "C:\\Users\\Tsyplik\\IdeaProjects\\Java-core\\src\\com\\pickles\\practice_15\\task_2\\NewTextFile.txt";

    public static void main(String[] args) {
        onlyPancakes(FIRST_FILE_PATH, NEW_FILE_PATH);
    }

    private static void onlyPancakes(String originalFile, String output) {
        try (FileReader fileReader = new FileReader(originalFile);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(output)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("pancakes")) {
                    fileWriter.write(line + "\n");
                }
                fileWriter.flush();
            }
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("File not found");
        } catch (IOException io) {
            System.out.println("IO Exception");
        }
    }
}