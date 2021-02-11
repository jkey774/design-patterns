package com.designpatterns.behavioral.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
