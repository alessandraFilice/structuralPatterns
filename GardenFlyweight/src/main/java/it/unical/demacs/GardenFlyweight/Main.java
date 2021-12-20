package it.unical.demacs.GardenFlyweight;

import java.awt.*;

public class Main {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 2000;
    static int TREE_TYPES = 3;

    public static void main(String[] args) {
    	Garden garden = new Garden();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            garden.plantFlower(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Yellow flower",Color.yellow);
            garden.plantFlower(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Magent flower", Color.MAGENTA);
            garden.plantFlower(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Orange flower", Color.ORANGE);

        }
        
        garden.setSize(CANVAS_SIZE, CANVAS_SIZE);
        garden.setVisible(true);

    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}