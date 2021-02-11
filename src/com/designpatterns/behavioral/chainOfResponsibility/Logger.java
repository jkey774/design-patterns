package com.designpatterns.behavioral.chainOfResponsibility;

public class Logger extends Handler {

    public Logger(Handler next) {
        super(next);
    }

    // returning false so the next handler in the chain gets called
    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Log");

        return false;
    }
}
