package org.yourcompany.yourproject;

import java.time.LocalDate;
import java.time.LocalTime;

public class Conference extends Event {
    private String topic;
    private String conferenceType;
    private String speaker;

    public Conference(int eventId, String name, String location, LocalDate date, LocalTime time,
                      String topic, String conferenceType, String speaker) {
        super(eventId, name, location, date, time);
        this.topic = topic;
        this.conferenceType = conferenceType;
        this.speaker = speaker;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getConferenceType() {
        return conferenceType;
    }

    public void setConferenceType(String conferenceType) {
        this.conferenceType = conferenceType;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    @Override
    public double calculatePrice() {
        return 50+(50*TAX);
    }

    @Override
    public void displayEvent() {
        System.out.println(this);
        printTickets();
    }

    @Override
    public String toString() {
        return "Conference{" +
                "eventId=" + eventId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", topic='" + topic + '\'' +
                ", conferenceType='" + conferenceType + '\'' +
                ", speaker='" + speaker + '\'' +
                '}';
    }

}
