/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pupu;

/**
 *
 * @author Daniel Haqeem
 */
import java.awt.*;
import javax.swing.*;

public class Pupu extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Clears the panel before painting

        // Draw face (circle)
        g.setColor(Color.GREEN);
        g.fillOval(100, 50, 200, 200);  // Face

        // Draw eyes (two circles)
        g.setColor(Color.blue);
        g.fillRect(100, 100, 100, 30);  // Left eye
        g.fillRect(200, 100, 100, 30);  // Right eye

        g.setColor(Color.BLACK);
        g.fillOval(160, 110, 25, 10);  // Left pupil
        g.fillOval(230, 110, 25, 10);  // Right pupil 
        
        // Draw mouth (arc)
        g.drawArc(175, 160, 50, 30, 0, -180);  // Mouth
        
        

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LEONARDO TMNT");
        Pupu panel = new Pupu();

        frame.add(panel);
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

