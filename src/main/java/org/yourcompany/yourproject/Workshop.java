package org.yourcompany.yourproject;

import java.time.LocalDate;
import java.time.LocalTime;

public class Workshop extends Event {
    private String topic;
    private String workshopType;

    public Workshop(int eventId, String name, String location, LocalDate date, LocalTime time,
                    String topic, String workshopType) {
        super(eventId, name, location, date, time);
        this.topic = topic;
        this.workshopType = workshopType;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getWorkshopType() {
        return workshopType;
    }

    public void setWorkshopType(String workshopType) {
        this.workshopType = workshopType;
    }

    @Override
    public double calculatePrice() {
        return 30+(30*TAX);
    }

    @Override
    public void displayEvent() {
        System.out.println(this);
        printTickets();
    }

    @Override
    public String toString() {
        return "Workshop{" +
                "eventId=" + eventId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", topic='" + topic + '\'' +
                ", workshopType='" + workshopType + '\'' +
                '}';
    }
}
