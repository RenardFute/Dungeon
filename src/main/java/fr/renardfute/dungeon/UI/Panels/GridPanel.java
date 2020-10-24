package fr.renardfute.dungeon.UI.Panels;

import fr.renardfute.dungeon.Main;
import fr.renardfute.dungeon.UI.Window;

import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;

public class GridPanel extends JPanel {

    Window window;

    public GridPanel(Window window) {
        this.window = window;
        
        Main.timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                repaint();
            }
        }, 0, (int) ((1.0f / this.window.getFrameRate()) * 1000));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        window.getDungeon().draw(g);
    }
}
