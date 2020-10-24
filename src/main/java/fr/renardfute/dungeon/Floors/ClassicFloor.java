package fr.renardfute.dungeon.Floors;

import fr.renardfute.dungeon.Rooms.ClassicRoom;
import fr.renardfute.dungeon.Rooms.Room;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ClassicFloor extends Floor {
    List<Room> rooms = new ArrayList<>();

    public ClassicFloor(){
        super(10, 10);
        generateRooms();
    }

    @Override
    public void generateRooms() {
        rooms.add(new ClassicRoom(10, 10));
    }

    @Override
    public void draw(Graphics g) {
        for (Room room : rooms) {
            room.draw(g);
        }
    }
}
