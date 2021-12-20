package it.unical.demacs.GardenFlyweight;

import java.awt.*;

public class FlowerType {
    private String name;
    private Color color;

    public FlowerType(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.GREEN);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}