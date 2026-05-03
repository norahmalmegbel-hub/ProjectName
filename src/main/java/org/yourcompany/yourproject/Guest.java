package org.yourcompany.yourproject;

public class Guest {
    private int guestId;
    private String name;
    private String phoneNum;

    public Guest(int guestId, String name, String phoneNum) {
        this.guestId = guestId;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Booking createBooking(Event event, Ticket ticket) {
        return new Booking(this, ticket, event);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
