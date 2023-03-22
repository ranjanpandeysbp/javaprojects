package com.mycompany.oopsconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketBookingSystem {
    private List<Integer> availableSeats = new ArrayList<>();
    private Lock lock = new ReentrantLock();

    public TicketBookingSystem(int numSeats) {
        for (int i = 1; i <= numSeats; i++) {
            availableSeats.add(i);
        }
    }

    public int bookSeat() {
        lock.lock();
        try {
            if (availableSeats.isEmpty()) {
                return -1; // indicates no available seats
            }
            int seatNumber = availableSeats.remove(0);
            System.out.println("Seat " + seatNumber + " booked by thread " + Thread.currentThread().getId());
            return seatNumber;
        } finally {
            lock.unlock();
        }
    }
}
