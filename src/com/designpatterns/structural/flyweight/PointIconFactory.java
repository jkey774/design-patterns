package com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// here we need to implement some kind of cache
// or a pool of objects that we can re-use
public class PointIconFactory {

    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        // in a real application, instead of passing null we would
        // call a method for reading a point icon from somewhere
        if (!icons.containsKey(type)) {
            PointIcon icon = new PointIcon(type, null);
            icons.put(type, icon);
        }

        return icons.get(type);
    }

}
