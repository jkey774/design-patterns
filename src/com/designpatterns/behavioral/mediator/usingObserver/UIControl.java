package com.designpatterns.behavioral.mediator.usingObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler observer) {
        eventHandlers.add(observer);
    }

    protected void notifyObservers() {
        for (EventHandler observer : eventHandlers)
            observer.handle();
    }

}
