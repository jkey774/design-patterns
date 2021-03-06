package com.designpatterns.behavioral.mediator.usingObserver;

public class Button extends UIControl {

    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyObservers();
    }

}
