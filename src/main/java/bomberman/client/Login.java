package bomberman.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {


    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                Login login = new Login();
                login.setVisible(true);
            }
        });

        // Creating the login form
        // Inspired from  https://www.guru99.com/java-swing-gui.html
        // and https://thethreeforbiddentopics.blogspot.com/2013/04/how-to-make-login-form-with-java-gui.html

        //Creating Frame
        Login loginFrame = new Login();
        loginFrame.setSize(400, 400);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a panale to welcome the player
        JPanel welcomePanel = new JPanel();
        JLabel welcome = new JLabel("WELCOME TO BOMERMAN");
        final JLabel label = new JLabel();
        label.setVisible(true);

        welcomePanel.add(welcome);
        welcomePanel.add(label);

        //Creating a panel for the Login components
        JPanel panel = new JPanel();

        JLabel labelUsername = new JLabel("Your username: ");
        final JTextField username = new JTextField(15);
        JButton button1 = new JButton("Login");
        button1.addActionListener(new ActionListener() {        // https://www.java-forum.org/thema/text-auf-jtextfield-auslesen-per-button.122429/

            public void actionPerformed(ActionEvent e) {
//                JLabel welcomeUser = new JLabel(myUsername);
//                        welcomeUser.setVisible(true);
                if (e.getSource() == username){
                    label.setText(("/username"));
                    label.setVisible(true);
                }

            }
        });


        // Adding the components
        panel.add(labelUsername);
        panel.add(username);
        panel.add(button1);





        // Layout
        loginFrame.getContentPane().

                add(BorderLayout.SOUTH, panel);
        loginFrame.getContentPane().

                add(BorderLayout.CENTER, welcomePanel);
        loginFrame.setVisible(true);
    }


}
