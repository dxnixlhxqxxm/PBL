/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jlabel;

/**
 *
 * @author Daniel Haqeem
 */
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class JLabel extends JFrame {
    private JLabel label1;
    
    public JLabel(){
       super("testing JLabel");
       Container container = getContentPane();
       container.setLayout(new FlowLayout());
       label1 = new JLabel("Label with text");
      // label1.setToolTipText("this is label1");
       container.add(label1);
       setSize(275,200);
       setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LabelTest application = new LabelTest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
      
    }
    
}
