package com.designpatterns.behavioral.command;

import com.designpatterns.behavioral.command.fx.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black and white");
    }

}
