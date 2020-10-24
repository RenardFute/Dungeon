package fr.renardfute.dungeon.UI;

import fr.renardfute.dungeon.Dungeon;
import fr.renardfute.dungeon.UI.Panels.GridPanel;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    int width, height, frameRate;
    GridPanel gridPanel;
    Dungeon dungeon;

    public Window(int width, int height, int frameRate, Dungeon dungeon){
        this.width = width;
        this.height = height;
        this.frameRate = frameRate;
        this.dungeon = dungeon;
        start();
    }

    private void start(){
        this.gridPanel = new GridPanel(this);
        this.setContentPane(this.gridPanel);
        this.setSize(this.width, this.height);
        this.setResizable(false);
        this.setEnabled(true);
        this.setVisible(true);
    }

    public Window(Dimension dimension, int frameRate, Dungeon dungeon){
       this.width = dimension.width;
       this.height = dimension.height;
       this.frameRate = frameRate;
       this.dungeon = dungeon;
       start();
    }

    public Dungeon getDungeon(){
        return this.dungeon;
    }

    public int getFrameRate() {
        return this.frameRate;
    }
}
