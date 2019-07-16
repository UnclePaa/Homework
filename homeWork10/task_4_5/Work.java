package com.pickles.practice_10.task_4_5;

import java.io.Serializable;

public class Work implements Serializable {
    private String workName;
    private int experience;

    public Work(String workName, int experience) {
        this.workName = workName;
        this.experience = experience;
    }

    private int getExperience() {
        return experience;
    }

    private String getWorkName() {
        return workName;
    }

    @Override
    public String toString() {
        return "I'm working at " + getWorkName() + " for " + getExperience() + " years";
    }
}
