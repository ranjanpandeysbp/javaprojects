package com.mycompany.oopsconcept;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchMain {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        Thread t1 = new Thread(new MyTask(latch));
        Thread t2 = new Thread(new MyTask(latch));
        Thread t3 = new Thread(new MyTask(latch));
        t1.start();
        t2.start();
        t3.start();

        try {
            latch.await();
            System.out.println("All tasks completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

