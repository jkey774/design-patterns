package com.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    // method serves as an extensibility point,
    // we can mass new types of operations to it without modifying it
    public void execute(Operation operation) {
        for (HtmlNode node : nodes)
            node.execute(operation);
    }

}
