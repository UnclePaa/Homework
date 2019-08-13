package com.pickles.practice_17_2.task_4;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class CallableFileCounter implements Callable {
    String link;

    public CallableFileCounter(String link) {
        this.link = link;
    }

    @Override
    public Object call() throws Exception {
        int fileQuantity = new File(link).listFiles().length;
        return fileQuantity;
    }
}