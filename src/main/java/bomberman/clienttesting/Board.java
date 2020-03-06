package bomberman.clienttesting;

<<<<<<< HEAD
import java.awt.*;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Board extends JPanel implements Constants {

    //Senften

=======
import javax.swing.*;
import java.awt.*;

public class Board extends JPanel implements Constants {

>>>>>>> 37d34ae... develop commit
    public Board(final int width, final int height) {
        setSize(width, height);
        this.addMouseListener(new MotionListener());
    }

<<<<<<< HEAD

    @Override
    protected void paintComponent(Graphics graphics) {
        graphics.setColor(Color.RED);
=======
    @Override
    protected void paintComponent(Graphics graphics) {
        graphics.setColor(Color.GREEN);
>>>>>>> 37d34ae... develop commit
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());

        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {

                int y = (row * SQUARE_SIZE) + SPACING;
                int x = (col * SQUARE_SIZE) + SPACING;

                // Initial color of all squares
                graphics.setColor(Color.LIGHT_GRAY);
                graphics.fillRect(x, y,
                        SQUARE_SIZE - SPACING, SQUARE_SIZE - SPACING);
<<<<<<< HEAD

            }
        }
    }


//    public Board(int size){
//        JPanel panel = new JPanel();
//        panel.setVisible(true);
//
//        Type[][] grid = new Type[][] {{Type.WALL,Type.BOMB},{Type.EMPTY,Type.PLAYER}};
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//
//                grid[i][j] = Type.WALL;
//                int y = (i * SQUARE_SIZE) + SPACING;
//                int x = (j * SQUARE_SIZE) + SPACING;
//
//            }
//        }
//    }
















    // Meins
//
//    private Image image;
//
//    public Board() {
//
//        initBoard();
//    }
//
//    private void initBoard() {
//
//        loadImage();
//
//        int w = image.getWidth(this);
//        int h = image.getHeight(this);
//        setPreferredSize(new Dimension(w, h));
//    }
//
//    private void loadImage() {
//
//        ImageIcon ii = new ImageIcon("src/main/java/images/Download.png");
//        image = ii.getImage();
//    }
//
//    @Override
//    public void paintComponent(Graphics g) {
//        for (int row = 0; row < GRID_SIZE; row++) {
//            for (int col = 0; col < GRID_SIZE; col++) {
//
//                int y = (row * SQUARE_SIZE) + SPACING;
//                int x = (col * SQUARE_SIZE) + SPACING;
//                g.fillRect(x, y,
//                        SQUARE_SIZE - SPACING, SQUARE_SIZE - SPACING);
////                g.drawImage(image, 0, 0, null);
//            }
//        }
//    }

=======
            }
        }

    }
>>>>>>> 37d34ae... develop commit
}
