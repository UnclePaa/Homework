package com.pickles.practice_13.task_6;

import java.util.LinkedList;
import java.util.List;

public class Sportsman {
    private String name;
    private Integer runSpeed;
    private List<String> medals;



    public Sportsman(String name, Integer runSpeed) {
        this.name = name;
        this.runSpeed = runSpeed;
    }

    public String getName() {
        return name;
    }

    public Integer getRunSpeed() {
        return runSpeed;
    }

    private void medalsList (List <String> fillMedalsList, String resultingMedal) {
        medals = new LinkedList<>();
        medals.add(resultingMedal);
    }
}

