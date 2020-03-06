package bomberman.client;

import javax.swing.*;
import java.awt.*;


public class Bomberman implements Constants {

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    Bomberman() {
        // Create and set up the window.
        JFrame frame = new JFrame("Bomberman");
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

//         Set up the content pane.
        frame.setContentPane(
//                new Board(Constants.WIDTH,Constants.HEIGHT));
                new Grid());


//        frame.setContentPane(
//                 new int[][] type = new int[4][4]);
//                );

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Bomberman();
            }
        });
    }
}
