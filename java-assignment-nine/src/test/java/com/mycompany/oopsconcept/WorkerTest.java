package com.mycompany.oopsconcept;

import java.util.concurrent.Semaphore;
import org.testng.annotations.Test;

public class WorkerTest {

    @Test(description = "test the functionality of the Worker class in a " +
            "multithreaded environment with a semaphore")
    public void testWorker() {
        Semaphore semaphore = new Semaphore(2);
        Worker worker1 = new Worker(semaphore, 1);
        Worker worker2 = new Worker(semaphore, 2);

        Thread thread1 = new Thread(worker1);
        Thread thread2 = new Thread(worker2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assert(semaphore.availablePermits() == 2);
    }
}

