package com.pickles.practice_17_2.task_1;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class AddElemToList {

    ReentrantLock reentrantLock = new ReentrantLock();

    public void addNewElem(List<Integer> integerList, int element) {
        reentrantLock.lock();
        integerList.add(element);
        reentrantLock.unlock();
    }
}