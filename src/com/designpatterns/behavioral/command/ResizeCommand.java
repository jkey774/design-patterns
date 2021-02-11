package com.designpatterns.behavioral.command;

import com.designpatterns.behavioral.command.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }

}
