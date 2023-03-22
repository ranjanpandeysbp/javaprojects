package com.mycompany.oopsconcept;

public class Main {
    public static void main(String[] args) {
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem(10);
        for (int i = 0; i < 20; i++) {
            User user = new User(ticketBookingSystem);
            user.start();
        }
    }
}
