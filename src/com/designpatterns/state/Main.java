package com.designpatterns.state;

public class Main {

    public static void main(String[] args) {

        // State Pattern allows an object to
        // behave differently when its state changes

        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        //canvas.setCurrentTool(new BrushTool());
        //canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
