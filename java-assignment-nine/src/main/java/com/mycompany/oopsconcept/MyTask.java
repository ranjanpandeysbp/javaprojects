package com.mycompany.oopsconcept;

import java.util.concurrent.CountDownLatch;

public class MyTask implements Runnable {

    private final CountDownLatch latch;

    public MyTask(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " completed");
        latch.countDown();
    }
}
