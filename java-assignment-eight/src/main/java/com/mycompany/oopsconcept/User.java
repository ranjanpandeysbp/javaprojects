package com.mycompany.oopsconcept;

public class User extends Thread {
    private TicketBookingSystem ticketBookingSystem;

    public User(TicketBookingSystem ticketBookingSystem) {
        this.ticketBookingSystem = ticketBookingSystem;
    }

    public void run() {
        int seatNumber = ticketBookingSystem.bookSeat();
        if (seatNumber == -1) {
            System.out.println("Thread " + Thread.currentThread().getId() + " could not book a seat.");
        }
    }
}
