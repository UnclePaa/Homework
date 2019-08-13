package com.pickles.practice_17_2.task_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FoldersCreator {

    public void createNewDir (String link, String name) {
        try {
            Path makeFolder = Files.createDirectory(Paths.get(link));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
