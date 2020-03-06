package main.java.bomberman.client;

import java.awt.*;

public enum Type {
    EMPTY (Color.BLUE),
    BOMB (Color.YELLOW),
    PLAYER  (Color.GREEN),
    WALL (Color.PINK),;

    private Color color;

    Type(Color color) {
        this.color = color;
    }
}
