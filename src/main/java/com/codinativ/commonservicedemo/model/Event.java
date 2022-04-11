package com.codinativ.commonservicedemo.model;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 11-April-2022 at 11:52
 * @Project common-service-demo
 * Happy Coding..!
 */
public class Event {
    private String name;
    private String address;
    private String event;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", event='" + event + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
