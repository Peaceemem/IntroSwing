package com.peace.Swing;
import javax.swing.*;
public class SwingDemo {
    //create a constructor for our class which will bw called in our main method
    public SwingDemo(){
        //create a new JFrame container I.E a smaller window that we can put things into it
        JFrame jFrame = new JFrame("First Swing Application");

        //Give it a size
        jFrame.setSize(275, 100);

        // Terminate the program when the user closes application
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create jlabel
        JLabel jLabel = new JLabel("Wow this is amazing");

        //add to frame
        jFrame.add(jLabel);
        jFrame.setLocationRelativeTo(null);


        //show it
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
     //create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
              new SwingDemo();
            }
        });
    }
}
