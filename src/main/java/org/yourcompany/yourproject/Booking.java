package org.yourcompany.yourproject;

public class Booking {
    private Guest guest;
    private Ticket ticket;
    private Event event;
    private static int count;
    private double totalPrice;

    public Booking() {
        count++;
    }

    public Booking(Guest guest, Ticket ticket, Event event) {
        this.guest = guest;
        this.ticket = ticket;
        this.event = event;
        count++;
        calculateTotalPrice();
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public static int getCount() {
        return count;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double calculateTotalPrice() {
        if (ticket == null) {
            totalPrice = 0;
        } else {
            totalPrice = ticket.calculatePrice();
        }
        return totalPrice;
    }

    public boolean confirmBooking() {
        if (ticket == null) {
            return false;
        }

        if (ticket.checkAvailability(1)) {
            ticket.setAvailableQuantity(ticket.getAvailableQuantity() - 1);
            calculateTotalPrice();
            return true;
        }
        return false;
    }

    public void cancelBooking() {
        if (ticket != null) {
            ticket.setAvailableQuantity(ticket.getAvailableQuantity() + 1);
            totalPrice = 0;
        }
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "guest=" + guest +
                ", ticket=" + ticket +
                ", event=" + event +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
