package com.designpatterns.behavioral.iterator;

public interface Iterator {
    boolean hasNext();
    String current();
    void next();
}
