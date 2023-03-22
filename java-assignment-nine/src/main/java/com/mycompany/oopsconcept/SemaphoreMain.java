package com.mycompany.oopsconcept;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 1; i <= 5; i++) {
            new Thread(new Worker(semaphore, i)).start();
        }
    }
}

