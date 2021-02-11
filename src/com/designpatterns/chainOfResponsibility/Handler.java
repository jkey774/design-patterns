package com.designpatterns.chainOfResponsibility;

public abstract class Handler {

    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request) {
        if (doHandle(request))
            return;

        if (next != null)
            next.handle(request);
    }

    // returning boolean representing
    // whether request is completely processed / handled
    // i.e. if false, then not finished, so call next
    public abstract boolean doHandle(HttpRequest request);

}
