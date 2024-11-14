/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paint;

/**
 *
 * @author Daniel Haqeem
 */
import java.awt.*;
import javax.swing.*;

public class Paint {

    /**
     * @param args the command line arguments
     */
    public static void main(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Times New Roman", Font.BOLD+Font.ITALIC,24));
        g.drawString("This is my first graphic design in Java",10,20);
        g.setColor(Color.RED);
        g.drawLine(5, 30, 380, 30);
       g.setColor( Color.magenta );
       g.fillArc( 10, 120,90, 90,45,30 );

    }
    
}
