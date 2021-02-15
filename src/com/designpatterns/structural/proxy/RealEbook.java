package com.designpatterns.structural.proxy;

public class RealEbook implements Ebook {

    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
    }

    private void load() {
        System.out.println("Loading the ebook " + fileName);
    }

    @Override
    public void show() {

    }

    @Override
    public String getFileName() {
        return fileName;
    }

}
