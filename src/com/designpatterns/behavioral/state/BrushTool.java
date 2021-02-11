package com.designpatterns.behavioral.state;

// ConcreteStateA as referred to by GoF
public class BrushTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
