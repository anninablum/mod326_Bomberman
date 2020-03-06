package main.java.bomberman.client;

import javax.swing.*;
import java.awt.*;

public class Grid extends Container {
    public Grid() {
        int i = 5;
        int j = 5;
        JPanel[][] panelHolder = new JPanel[i][j];
        setLayout(new GridLayout(i,j));

        for (int m = 0; m<i; m++){
            for (int n = 0; n<j; n++){
                panelHolder[m][n] = new JPanel();
                add(panelHolder[m][n]);
            }
        }
//        Type bomb = new Type.BOMB;
//
//        panelHolder[0][0].add(bomb);
//        panelHolder[0][1].add(Type.EMPTY);
//        Type grid[][]= new Type[][]{{Type.PLAYER,Type.EMPTY},{Type.BOMB,Type.WALL}};

    }


}
