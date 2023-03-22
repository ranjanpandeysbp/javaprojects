package com.mycompany.oopsconcept;

import org.testng.annotations.Test;
import java.util.concurrent.CountDownLatch;

public class MyTaskTest {

    @Test(description = "Test that the MyTask completes successfully.")
    public void testMyTask() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        MyTask task = new MyTask(latch);
        Thread thread = new Thread(task);
        thread.start();
        latch.await();
        assert !thread.isAlive();
    }

}

