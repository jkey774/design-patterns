package com.designpatterns.behavioral.command.fx;

public class Button {

    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    // code executed here will be depend where we use this button
    public void click() {
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
