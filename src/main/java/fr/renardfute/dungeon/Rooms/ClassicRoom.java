package fr.renardfute.dungeon.Rooms;

import fr.renardfute.dungeon.Floors.Floor;
import fr.renardfute.dungeon.Main;

import java.awt.*;

public class ClassicRoom extends Room {

    public ClassicRoom(int x, int y, Floor floor) {
        super(x, y, 2, 3, .5f, floor);
    }

    @Override
    public void draw(Graphics g) {
        int width_ratio = Main.WIDTH / floor.getWidth();
        int height_ration = Main.HEIGHT / floor.getHeight();
        g.setColor(new Color(255, 152, 0, 102));
        g.fillRect(super.x * width_ratio, super.y * height_ration, super.width * width_ratio, super.height * height_ration);
        g.drawRect(super.x * width_ratio, super.y * height_ration, super.width * width_ratio, super.height * height_ration);
    }
}
