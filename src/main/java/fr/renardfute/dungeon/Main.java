package fr.renardfute.dungeon;

import fr.renardfute.dungeon.Floors.ClassicFloor;
import fr.renardfute.dungeon.UI.Window;

import java.util.Timer;

public class Main {

    public static Timer timer = new Timer();
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int FRAMERATE = 60;

    public static void main(String... args){
        Dungeon dungeon = new Dungeon.Builder("Test dungeon")
                .addFloor(new ClassicFloor())
                .addFloor(new ClassicFloor())
                .build();
        new Window(WIDTH, HEIGHT, FRAMERATE, dungeon);
        System.out.println(dungeon.toString());
        while (true){

        }
    }

    public static void print(Object object){
        System.out.println(object.toString());
    }
}
