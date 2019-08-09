package com.pickles.practice_17.task_3;

public class Task_3_Main {
    public static void main(String[] args) {
        Task_3_ToyStore toyStore = new Task_3_ToyStore();

        Runnable putFromFirstProducer = () -> {
            toyStore.put(100_000_000);
        };

        Runnable putFromSecondProducer = () -> {
            toyStore.put(5000_000_00);
        };

        Thread firstProducer = new Thread(putFromFirstProducer);
        Thread secondProducer = new Thread(putFromSecondProducer);
        Thread secondProducer_3 = new Thread(putFromSecondProducer);
        firstProducer.start();
        secondProducer.start();
        secondProducer_3.start();

        try {
            firstProducer.join();
            secondProducer.join();
            secondProducer_3.join();
        } catch (InterruptedException interExc) {
            interExc.printStackTrace();
        }

        toyStore.showMeAllStuff();
    }
}
