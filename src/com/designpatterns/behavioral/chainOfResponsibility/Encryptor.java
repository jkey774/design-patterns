package com.designpatterns.behavioral.chainOfResponsibility;

public class Encryptor extends Handler {

    public Encryptor(Handler next) {
        super(next);
    }

    // returning false so the next handler in the chain gets called
    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encryption");
        return false;
    }

}
