package fr.renardfute.dungeon.Floors;

import java.awt.*;

public abstract class Floor {

    int width, height;

    public Floor(int width, int height){
        this.width = width;
        this.height = height;
    }

    abstract public void generateRooms();

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    abstract public void draw(Graphics g);
}
