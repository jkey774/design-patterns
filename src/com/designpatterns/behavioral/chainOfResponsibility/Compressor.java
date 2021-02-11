package com.designpatterns.behavioral.chainOfResponsibility;

public class Compressor extends Handler {

    public Compressor(Handler next) {
        super(next);
    }

    // returning false so the next handler in the chain gets called
    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compress");

        return false;
    }

}
