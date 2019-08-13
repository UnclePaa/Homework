package com.pickles.practice_17_2.task_6;

import java.io.File;

public class Task_6_Main {
    public static void main(String[] args) {
    Links links = new Links();
    FoldersCreator foldersCreator = new FoldersCreator();

    foldersCreator.createNewDir(Links.getFolderPath(), "1");
    foldersCreator.createNewDir(Links.getFolderPath(), "2");
    foldersCreator.createNewDir(Links.getFolderPath(), "3");
    }
}