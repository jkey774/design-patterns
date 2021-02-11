package com.designpatterns.command;

import com.designpatterns.command.editor.BoldCommand;
import com.designpatterns.command.editor.History;
import com.designpatterns.command.editor.HtmlDocument;
import com.designpatterns.command.editor.UndoCommand;
import com.designpatterns.command.fx.Button;
import com.designpatterns.command.fx.Command;

public class Main {

    public static void main(String[] args) {

        // begin basic example

        CustomerService service = new CustomerService();

        Command command = new AddCustomerCommand(service);

        Button button = new Button(command);

        button.click();

        // begin composite command example
        // ability to store and re-execute commands at a later time

        CompositeCommand composite = new CompositeCommand();

        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());

        composite.execute();
        composite.execute();

        // begin undoable command example

        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello World");

        BoldCommand boldCommand = new BoldCommand(document, history);

        boldCommand.execute();
        System.out.println(document.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());

    }

}
