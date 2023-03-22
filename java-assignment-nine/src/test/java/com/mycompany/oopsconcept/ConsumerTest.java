package com.mycompany.oopsconcept;

import org.testng.annotations.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConsumerTest {
    private static final int QUEUE_CAPACITY = 10;
    private BlockingQueue<Integer> queue;

    @Test(description = "Test the Consumer")
    public void testConsumer() throws InterruptedException {
        // Create a blocking queue
        queue = new LinkedBlockingQueue<>(QUEUE_CAPACITY);

        // Create a producer that will produce 10 integers in the queue
        Producer producer = new Producer(queue);
        Thread producerThread = new Thread(producer);
        producerThread.start();

        // Create a consumer that will consume 10 integers from the queue
        Consumer consumer = new Consumer(queue);
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

        // Wait for the producer and consumer threads to finish
        producerThread.join();
        consumerThread.join();
    }
}
