package fr.renardfute.dungeon.Floors;

import fr.renardfute.dungeon.Rooms.ClassicRoom;
import fr.renardfute.dungeon.Rooms.Room;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicFloor extends Floor {
    List<Room> rooms = new ArrayList<>();

    public ClassicFloor(){
        super(15, 15);
        generateRooms();
    }

    @Override
    public void generateRooms() {
        for (int y = 0; y < super.height; y++) {
            for (int x = 0; x < super.width; x++) {
                boolean isOverLapping = false;
                for (Room room : rooms) {
                    if ( (room.getCoordinates().getX() < x && room.getCoordinates().getX() + room.getWidth() > x) ||
                            (room.getCoordinates().getY() < y && room.getCoordinates().getY() + room.getHeight() > y)){
                        isOverLapping = true;
                        break;
                    }
                }
                if(!isOverLapping){
                    float r = new Random().nextFloat();
                    float oldProb = 0;
                    Room.Type type = null;
                    for(Room.Type type_: Room.Type.values()){
                        if(r > oldProb && r < type_.getRarity()){
                            type = type_;
                        }
                        oldProb += type_.getRarity();
                    }
                    if (type != null) {
                        switch (type){
                            case CLASSIC -> {
                                try{
                                    rooms.add(new ClassicRoom(x, y, this));
                                }catch (IllegalStateException ignored){

                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void draw(Graphics g) {
        for (Room room : rooms) {
            room.draw(g);
        }
    }
}
