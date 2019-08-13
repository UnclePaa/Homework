package com.pickles.practice_17_2.task_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Callable;

public class CallableTxtWordsCounter implements Callable {
    private String link;

    public CallableTxtWordsCounter(String link) {
        this.link = link;
    }

    private int result;

    @Override
    public Integer call() throws Exception {
        int counter = 0;
        try (FileReader fr = new FileReader(link);
             BufferedReader br = new BufferedReader(fr)) {
            String checkLine = br.readLine();
            String regex = "[ .,!?/]";
            while (checkLine != null) {
                String[] lineToArray = checkLine.split(regex);
                for (String line : lineToArray) {
                    counter++;
                }
                checkLine = br.readLine();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
        return counter;
    }
}
