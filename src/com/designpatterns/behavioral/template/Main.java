package com.designpatterns.behavioral.template;

public class Main {

    public static void main(String[] args) {
        Task task = new TransferMoneyTask();
        task.execute();
    }
}
