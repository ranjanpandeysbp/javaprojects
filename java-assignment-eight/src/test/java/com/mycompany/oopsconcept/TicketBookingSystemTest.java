package com.mycompany.oopsconcept;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TicketBookingSystemTest {

    @Test(threadPoolSize = 5, invocationCount = 10, timeOut = 10000)
    public void testBookSeat() {
        TicketBookingSystem tbs = new TicketBookingSystem(10);
        int seatNumber = tbs.bookSeat();
        assertTrue(seatNumber > 0 && seatNumber <= 10, "Invalid seat number returned: " + seatNumber);
    }
}

