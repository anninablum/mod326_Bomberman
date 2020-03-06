package bomberman.clienttesting;

//https://stackoverflow.com/questions/2782068/what-are-tiles-and-how-are-they-created-in-the-bufferedimage

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ToyTiled extends JFrame {

    private static final int IMAGE_TYPE = BufferedImage.TYPE_INT_ARGB;

    File imageFile = new File("C:\\Users\\vmadmin\\IdeaProjects\\mod326_Bomberman\\src\\main\\java\\images\\Face-smile-2.png");


    private BufferedImage img = ImageIO.read(imageFile);


    public static void main( String[] args ) throws IOException {
        new ToyTiled();
    }

    public ToyTiled() throws IOException {
        super();
        this.add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.drawImage(img, 0, 0, null);
            }

        });
        img = new BufferedImage( 450, 350, IMAGE_TYPE );   // here you should create a compatible BufferedImage
        this.setSize(img.getWidth(), img.getHeight());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);


//        final int NB_TILES = 4;
//        BufferedImage[] tiles = new BufferedImage[NB_TILES];
//        tiles[0] = createOneTile( new Color( 255, 255, 255 ) );
//        tiles[1] = createOneTile( new Color( 255,   0, 255 ) );
//        tiles[2] = createOneTile( new Color(   0,   0, 255 ) );
//        tiles[3] = createOneTile( new Color(   0, 255, 255 ) );
//

        final int NB_TILES1 = 4;
        BufferedImage[] tiles = new BufferedImage[NB_TILES1];
        tiles[0] = createOneTile( new BufferedImage( 255, 255, IMAGE_TYPE ) );
        tiles[1] = createOneTile( new BufferedImage( 255,   255, IMAGE_TYPE ) );
        tiles[2] = createOneTile( new BufferedImage(   255,   255, IMAGE_TYPE ) );
        tiles[3] = createOneTile( new BufferedImage(   255, 255, IMAGE_TYPE ) );




        final int[][] map = new int[][] {
                { 1, 0, 2, 3, 0, 1, 2, 2, 2 },
                { 0, 2, 3, 0, 1, 2, 2, 2, 3 },
                { 1, 0, 2, 3, 0, 1, 2, 2, 2 },
                { 2, 1, 0, 1, 2, 3, 2, 0, 0 },
                { 1, 0, 2, 3, 0, 1, 2, 2, 3 },
                { 1, 0, 2, 2, 1, 1, 2, 2, 3 },
                { 1, 0, 2, 3, 0, 1, 2, 2, 3 },
        };

        for (int i = 0; i < map[0].length; i++) {
            for (int j = 0; j < map.length; j++) {
                final BufferedImage tile = tiles[map[j][i]];
                for (int x = 0; x < tile.getWidth(); x++) {
                    for (int y = 0; y < tile.getHeight(); y++) {
                        img.setRGB( x + i * 50, y + j * 50, tile.getRGB(x,y) );
                    }
                }
            }
        }

        this.setVisible( true );
    }

    private BufferedImage createOneTile( Color c ) {
        final Random r = new Random();
        final BufferedImage res = new BufferedImage( 50, 50, IMAGE_TYPE );
        for (int x = 0; x < res.getWidth(); x++) {
            for (int y = 0; y < res.getHeight(); y++) {
                res.setRGB( x, y, c.getRGB() - r.nextInt(150) );
            }
        }
        return res;
    }

    private BufferedImage createOneTile( BufferedImage c ) {
        final Random r = new Random();
        final BufferedImage res = new BufferedImage( 50, 50, IMAGE_TYPE );
        for (int x = 0; x < res.getWidth(); x++) {
            for (int y = 0; y < res.getHeight(); y++) {
                res.getData();
            }
        }
        return res;
    }

}