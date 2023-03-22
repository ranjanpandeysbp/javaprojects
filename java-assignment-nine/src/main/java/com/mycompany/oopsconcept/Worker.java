package com.mycompany.oopsconcept;

import java.util.concurrent.Semaphore;

public class Worker implements Runnable {
    private final Semaphore semaphore;
    private final int id;

    public Worker(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Worker " + id + " acquired semaphore.");
            Thread.sleep(1000);
            System.out.println("Worker " + id + " releasing semaphore.");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
