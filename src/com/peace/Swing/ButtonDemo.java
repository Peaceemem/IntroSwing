package com.peace.Swing;

import javax.swing.*;
import java.awt.*;

public class ButtonDemo {

    JLabel myLabel;
    public ButtonDemo(){

        //CREATE A JFRAME
        JFrame jFrame = new JFrame("Button");

        //specify flowlayout for the layout manager
        jFrame.setLayout(new FlowLayout());

        //Give the size to our frame
        jFrame.setSize(220, 80);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));


        //Make a button
        JButton UpButton = new JButton("Up");
        JButton DownButton = new JButton("Down");

        myLabel = new JLabel("Hello there");

        jFrame.add(UpButton);
        jFrame.add(DownButton);
        jFrame.add(myLabel);

        //jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);

        jFrame.setVisible(true);



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
