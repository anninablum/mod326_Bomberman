package bomberman.client;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel implements Constants {

    public Board(final int width, final int height) {
        setSize(width, height);
        this.addMouseListener(new MotionListener());
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());

        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {

                int y = (row * SQUARE_SIZE) + SPACING;
                int x = (col * SQUARE_SIZE) + SPACING;

                // Initial color of all squares
                graphics.setColor(Color.LIGHT_GRAY);
                graphics.fillRect(x, y,
                        SQUARE_SIZE - SPACING, SQUARE_SIZE - SPACING);
            }
        }

    }
}
