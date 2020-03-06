package bomberman.clienttesting;

import java.awt.*;

public class Grid extends Container {
//    public Grid() {
//        int i = 5;
//        int j = 5;
//        JPanel[][] panelHolder = new JPanel[i][j];
//        setLayout(new GridLayout(i,j));
//
//        for (int m = 0; m<i; m++){
//            for (int n = 0; n<j; n++){
//                panelHolder[m][n] = new JPanel();
//                add(panelHolder[m][n]);
//            }
//        }
//        Type bomb = new Type.BOMB;
//
//        panelHolder[0][0].add(bomb);
//        panelHolder[0][1].add(Type.EMPTY);
//        Type grid[][]= new Type[][]{{Type.PLAYER,Type.EMPTY},{Type.BOMB,Type.WALL}};

//    }


    public Tile[][] map;

    public Grid() {
        map = new Tile[20][15];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = new Tile(i * 64, j * 64, 64, 64, Type.WALL);
            }
        }
    }

    public Grid(int[][] newMap) {
        map = new Tile[20][15];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                switch (newMap[i][j]) {
                    case 0:
                        map[i][j] = new Tile(i * 64, j * 64, 64, 64, Type.EMPTY);
                        break;
                    case 1:
                        map[i][j] = new Tile(i * 64, j * 64, 64, 64, Type.GRASS);
                        break;
                }
            }
        }
    }

    public void Draw() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                Tile t = map[i][j];
                DrawQuadTex(t.getTexture(), t.getX89, t.getY89, t.getWidth(), t.getHeight())
            }
        }


    }
}
