package com.designpatterns.mediator.observer;

public class Main {

    public static void main(String[] args) {

        // mediator pattern implemented using the observer pattern

        ArticlesDialogBox dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();

    }

}
