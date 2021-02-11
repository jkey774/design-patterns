package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

// a.k.a Observable object
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update();
    }


}
