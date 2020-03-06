package bomberman.clienttesting;

import java.awt.*;

public enum Type {
    EMPTY (Color.BLUE),
    BOMB (Color.YELLOW),
    PLAYER  (Color.GREEN),
    WALL (Color.PINK),
    GRASS (Color.GREEN);

    private Color color;

    Type(Color color) {
        this.color = color;
    }
}
