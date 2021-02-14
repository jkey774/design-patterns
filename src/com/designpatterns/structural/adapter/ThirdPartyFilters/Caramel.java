package com.designpatterns.structural.adapter.ThirdPartyFilters;

import com.designpatterns.structural.adapter.Image;

public class Caramel {

    public void init() {

    }

    public void render(Image image) {
        System.out.println("Applying Caramelt Filter");
    }

}
