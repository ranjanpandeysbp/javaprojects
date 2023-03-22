package com.mycompany.oopsconcept;

import org.testng.annotations.Test;

public class UserTest {
    private TicketBookingSystem ticketBookingSystem = new TicketBookingSystem(10);

    @Test(threadPoolSize = 5, invocationCount = 10)
    public void testBookSeat() throws InterruptedException {
        User user = new User(ticketBookingSystem);
        user.start();
        user.join();
    }
}
