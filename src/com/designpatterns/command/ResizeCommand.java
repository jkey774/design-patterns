package com.designpatterns.command;

import com.designpatterns.command.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }

}
