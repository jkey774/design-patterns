package com.designpatterns.structural.facade;

public class Main {

    // the facade pattern allows us to provide
    // a simple interface to a complex system

    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.send("Hello World", "target");

    }

}