package com.pickles.practice_10.task_6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class TextInPicture {
    public static final String FILE_PATH = "C:\\Users\\Tsyplik\\IdeaProjects\\Java-core\\src\\com\\pickles\\practice_10\\task_6\\pic.jpg";
public static final String STRING = "Have a nice day!";
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH, true)) {
            fos.write(STRING.getBytes());
            System.out.println(Arrays.toString(STRING.getBytes()));
            fos.flush();
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        } catch (IOException io) {
            System.out.println("IOException");
        }
    }
}
