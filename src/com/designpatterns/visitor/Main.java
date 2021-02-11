package com.designpatterns.visitor;

public class Main {

    public static void main(String[] args) {

        // visitor pattern is useful when object structure is stable
        // but we want to support new operations frequently
        // such as an HTML document where new types of nodes are rare
        // but quite often needs to support new types of operations

        HtmlDocument document = new HtmlDocument();

        document.add(new HeadingNode());
        document.add(new AnchorNode());

        document.execute(new HighlightOperation());

        // after adding a new operation
        document.execute(new PlainTextOperation());

    }

}
