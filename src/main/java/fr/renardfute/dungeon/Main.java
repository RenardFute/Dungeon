package fr.renardfute.dungeon;

import fr.renardfute.dungeon.Floors.ClassicFloor;
import fr.renardfute.dungeon.Floors.Floor;
import fr.renardfute.dungeon.UI.Window;

import java.util.Timer;

public class Main {

    public static Timer timer = new Timer();

    public static void main(String... args){
        Dungeon dungeon = new Dungeon.Builder("Test dungeon")
                .addFloor(new ClassicFloor())
                .addFloor(new ClassicFloor())
                .build();
        new Window(600, 600, 60, dungeon);
        System.out.println(dungeon.toString());
        while (true){

        }
    }
}
