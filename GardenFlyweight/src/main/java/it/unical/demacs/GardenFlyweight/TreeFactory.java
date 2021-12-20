package it.unical.demacs.GardenFlyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, FlowerType> flowerType = new HashMap<>();

    public static FlowerType getFlowerType(String name, Color color) {
    	FlowerType type = flowerType.get(name);
        if (type == null) {
            type = new FlowerType(name, color);
            flowerType.put(name, type);
        }
        return type;
    }
}