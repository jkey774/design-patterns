package com.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {

        // using the pull style of communication

        DataSource dataSource = new DataSource();

        Spreadsheet sheet1 = new Spreadsheet(dataSource);
        Spreadsheet sheet2 = new Spreadsheet(dataSource);

        Chart chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

    }
}
