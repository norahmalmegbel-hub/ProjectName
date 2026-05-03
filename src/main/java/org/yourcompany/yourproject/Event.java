package org.yourcompany.yourproject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;


public abstract class Event implements EventOperations {
    protected String name;
    protected LocalDate date;
    protected LocalTime time;
    protected ArrayList<Ticket> tickets;
    protected int eventId;
    protected String location;

    public Event(int eventId, String name, String location, LocalDate date, LocalTime time) {
        this.eventId = eventId;
        this.name = name;
        this.location = location;
        this.date = date;
        this.time = time;
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        if (ticket != null) {
            tickets.add(ticket);
        }
    }

    public void cancelTicket(int ticketId) {
        Iterator<Ticket> iterator = tickets.iterator();
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            if (ticket.getTicketId() == ticketId) {
                iterator.remove();
                break;
            }
        }
    }

    public abstract void displayEvent();

    protected void printTickets() {
        for (Ticket ticket : tickets) {
            System.out.println("  " + ticket);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
   
    
    public abstract String toString(); 
}
