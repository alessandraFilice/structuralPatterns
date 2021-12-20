package it.unical.demacs.GardenFlyweight;

import java.awt.*;

public class Demo {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
    	Garden garden = new Garden();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            garden.plantFlower(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Summer flower",Color.yellow);
            garden.plantFlower(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),"Spring flower", Color.MAGENTA);
        }
        
        garden.setSize(CANVAS_SIZE, CANVAS_SIZE);
        garden.setVisible(true);

    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}