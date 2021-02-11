package com.designpatterns.behavioral.chainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    // a real application would often query a DB here
    @Override
    public boolean doHandle(HttpRequest request) {
        boolean isValid = (request.getUsername() == "admin" &&
                request.getPassword() == "1234");

        System.out.println("Authentication");
        return !isValid;
    }

}
