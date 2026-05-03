package org.yourcompany.yourproject;

public class Ticket {
    private double price;
    private String name;
    private String ticketType;
    private int availableQuantity;
    private int ticketId;

    public Ticket(int ticketId, String name, String ticketType, double price) {
        this.ticketId = ticketId;
        this.name = name;
        this.ticketType = ticketType;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public boolean checkAvailability(int count) {
        return count > 0 && availableQuantity >= count;
    }



    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", name='" + name + '\'' +
                ", ticketType='" + ticketType + '\'' +
                ", price=" + price +
                ", availableQuantity=" + availableQuantity +
                '}';
    }
}
