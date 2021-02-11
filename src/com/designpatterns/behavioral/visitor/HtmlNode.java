package com.designpatterns.behavioral.visitor;

// could also use an abstract class if
// we wanted to share some common behavior
// across different types of nodes
public interface HtmlNode {
    void execute(Operation operation);
}
