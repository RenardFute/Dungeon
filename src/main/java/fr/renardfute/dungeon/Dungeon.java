package fr.renardfute.dungeon;

import fr.renardfute.dungeon.Floors.Floor;
import fr.renardfute.dungeon.Utils.ArrayUtils;

import java.awt.*;

public class Dungeon {

    Floor[] floors = new Floor[0];
    final String name;

    public Dungeon(String name) {
        this.name = name;
    }

    public void draw(Graphics g){
        for (Floor floor:
                this.floors) {
            floor.draw(g);
        }
    }

    public String toString(){
        StringBuilder str = new StringBuilder("{");
        //Name
        str.append("Name:\"");
        str.append(this.name);
        str.append("\",");

        //Floors
        str.append("Floors:{");
        for (Floor floor:
             floors) {
            String floorName = floor.getClass().getName();
            floorName = floorName.replace(floor.getClass().getPackageName() + ".", "");
            str.append(floorName);
            str.append(",");
        }
        str.replace(str.length() - 1, str.length(), "");
        str.append("}");

        //END
        str.append("}");
        return str.toString();
    }

    static class Builder {

        Dungeon dungeon;

        public Builder(String name){
            this.dungeon = new Dungeon(name);
        }

        public Dungeon.Builder addFloor(Floor floor){
            dungeon.floors = new ArrayUtils<>(Floor.class).append(dungeon.floors, floor);
            return this;
        }

        public Dungeon build(){
            return dungeon;
        }

    }
}
