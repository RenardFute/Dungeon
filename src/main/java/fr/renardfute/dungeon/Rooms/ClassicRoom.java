package fr.renardfute.dungeon.Rooms;

import java.awt.*;

public class ClassicRoom extends Room {

    public ClassicRoom(int x, int y) {
        super(x, y, 2, 3, .5f);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(super.x, super.y, super.width, super.height);
    }
}
