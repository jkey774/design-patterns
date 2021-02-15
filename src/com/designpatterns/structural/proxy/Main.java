package com.designpatterns.structural.proxy;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        String[] fileNames = { "a", "b", "c" };

        for (String fileName : fileNames) {
            // library.add(new EbookProxy(fileName));
            library.add(new LoggingEbookProxy(fileName));
        }

        library.openEbook("a");

    }

}