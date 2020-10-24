package fr.renardfute.dungeon.Rooms;

import fr.renardfute.dungeon.Floors.Floor;
import fr.renardfute.dungeon.Utils.Coordinates;

import java.awt.*;

public abstract class Room {

    int x, y;
    int width, height;
    float rarity;
    Floor floor;

    public Room(int x, int y, int width, int height, float rarity, Floor floor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.rarity = rarity;
        this.floor = floor;
        if (floor != null) {
            if(this.x >= floor.getWidth() || this.x >= floor.getHeight() || this.width >= floor.getWidth() || this.height >= floor.getHeight()){
                throw new IllegalArgumentException("Verifier que la piece ne depasse pas de l'etage !");
            }
            if(this.x + this.getWidth() > floor.getWidth() || this.y + this.getHeight() > floor.getHeight()){
                throw new IllegalStateException("La piece dépasse de l'etage !");
            }
        }
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

    public Coordinates getCoordinates() {
        return new Coordinates(this.x, this.y);
    }

    abstract public void draw(Graphics g);

    public enum Type {
        CLASSIC(new ClassicRoom(0, 0, null).getRarity());

        float rarity;

        Type(float rarity) {
            this.rarity = rarity;
        }

        public float getRarity(){
            return this.rarity;
        }
    }
}
