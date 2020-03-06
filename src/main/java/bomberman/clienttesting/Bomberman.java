package bomberman.clienttesting;

import javax.swing.*;
import java.awt.*;

<<<<<<< HEAD

=======
>>>>>>> 37d34ae... develop commit
public class Bomberman implements Constants {

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
<<<<<<< HEAD
    Bomberman() {
=======
    private Bomberman() {
>>>>>>> 37d34ae... develop commit
        // Create and set up the window.
        JFrame frame = new JFrame("Bomberman");
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

<<<<<<< HEAD
//         Set up the content pane.
        frame.setContentPane(
//                new Board(Constants.WIDTH,Constants.HEIGHT));
                new Grid());


//        frame.setContentPane(
//                 new int[][] type = new int[4][4]);
//                );
=======
        // Set up the content pane.
        frame.setContentPane(
                new Board(Constants.WIDTH, Constants.HEIGHT));
>>>>>>> 37d34ae... develop commit

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
