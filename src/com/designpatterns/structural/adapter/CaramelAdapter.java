package com.designpatterns.structural.adapter;

import com.designpatterns.structural.adapter.ThirdPartyFilters.Caramel;

// favoring composition over inheritance
public class CaramelAdapter implements Filter {

    private Caramel caramel;

    public CaramelAdapter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
