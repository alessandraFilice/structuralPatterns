package it.unical.demacs.GardenFlyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Garden extends JFrame {
    private List<Flower> flowers = new ArrayList<>();

    public void plantFlower(int x, int y, String name, Color color) {
    	FlowerType type = TreeFactory.getFlowerType(name, color);
    	Flower flower = new Flower(x, y, type);
    	flowers.add(flower);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Flower flower : flowers) {
            flower.draw(graphics);
        }
    }
}