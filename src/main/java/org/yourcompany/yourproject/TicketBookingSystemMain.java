

package org.yourcompany.yourproject;

import java.time.LocalDate;
import java.time.LocalTime;

public class TicketBookingSystemMain {

    public static void main(String[] args) {
        LocalDate conferenceDate = LocalDate.of(2026, 9, 15);
        LocalTime conferenceTime = LocalTime.of(10, 30);
        Conference conference = new Conference(1, "Java Conference", "Main Hall", conferenceDate, conferenceTime,
                "Java Platform", "Technical", "Dr. Smith");

        Ticket vipTicket = new Ticket(101, "VIP Pass", "VIP", 200.00);
        vipTicket.setAvailableQuantity(10);
        Ticket generalTicket = new Ticket(102, "General Admission", "Standard", 75.00);
        generalTicket.setAvailableQuantity(50);

        conference.addTicket(vipTicket);
        conference.addTicket(generalTicket);

        Guest guest = new Guest(301, "Aisha", "555-1234");
        Booking booking = guest.createBooking(conference, vipTicket);

        System.out.println("Event details:");
        conference.displayEvent();

        System.out.println("\nBooking confirmation:");
        if (booking.confirmBooking()) {
            booking.print();
        } else {
            System.out.println("Booking could not be confirmed.");
        }
    }
}
