package fr.renardfute.dungeon.Rooms;

import java.awt.*;

public abstract class Room {

    int x, y;
    int width, height;
    float rarity;

    public Room(int x, int y, int width, int height, float rarity) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.rarity = rarity;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public float getRarity() {
        return rarity;
    }

    abstract public void draw(Graphics g);
}
