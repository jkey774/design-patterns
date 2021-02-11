package com.designpatterns.chainOfResponsibility;

// instead of talking to concrete handler objects,
// we're going to maintain a reference to the first handler in the chain
public class WebServer {

    private Handler handler;

    // in real application should add if-statement to ensure handler is not null
    // a web server should have at least one handler
    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request) {
        handler.handle(request);
    }

}
