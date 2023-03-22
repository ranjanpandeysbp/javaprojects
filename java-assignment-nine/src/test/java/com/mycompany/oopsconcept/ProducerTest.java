package com.mycompany.oopsconcept;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import org.testng.annotations.Test;

public class ProducerTest {

    @Test(description = "Test the functionality of the Producer class in a " +
            "multithreaded environment with a blocking queue.")
    public void testProducer() throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);

        Thread thread = new Thread(producer);
        thread.start();

        for (int i = 0; i < 10; i++) {
            Integer value = queue.take();
            assert(value.equals(i));
            System.out.println("Consumed: " + value);
        }

        thread.join();
    }
}

