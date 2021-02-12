package com.designpatterns.behavioral.chainOfResponsibility;

public class Main {

    public static void main(String[] args) {

        // imagine the following processing pipeline
        // authenticator -> logger -> compressor -> encryptor

        // creating encryptor first because is last handler in the chain
        // passing null because it is the last handler in the chain
        Handler encryptor = new Encryptor(null);
        Handler compressor = new Compressor(encryptor);
        Handler logger = new Logger(compressor);
        Handler authenticator = new Authenticator(logger);

        // passing authenticator because is the first handler in the chain
        WebServer server = new WebServer(authenticator);

        // simulating request sent from a valid user
        server.handle(new HttpRequest("admin", "1234"));

        // simulating request sent from an invalid user
        // processing is stopped right in the authentication step
        server.handle(new HttpRequest("-", "1234"));

        // if in the future we want to get rid of the logger,
        // can comment out line 14 and pass compressor to new Authenticator()

    }

}
