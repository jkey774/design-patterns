package com.designpatterns.structural.adapter;

import com.designpatterns.structural.adapter.ThirdPartyFilters.Caramel;

public class Main {

    public static void main(String[] args) {

        ImageView imageView = new ImageView(new Image());

        imageView.apply(new VividFilter());

        imageView.apply(new CaramelAdapter(new Caramel()));

    }

}
