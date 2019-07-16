package com.pickles.practice_10.task_6;

import java.io.*;
import java.util.Arrays;

public class ReadTextFromPicture {
    public static final String PIC_PATH = "C:\\Users\\Tsyplik\\IdeaProjects\\Java-core\\src\\com\\pickles\\practice_10\\task_6\\pic.jpg";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(PIC_PATH)) {
            byte [] allBytes = fis.readAllBytes();
            for (int i = 0; i < allBytes.length ; i++) {
                byte ch = allBytes[i];
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        } catch (IOException io) {
            System.out.println("IO Exception");
        }
    }
}
