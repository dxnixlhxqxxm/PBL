/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arithmeticprog;

/**
 *
 * @author Daniel Haqeem
 */
import java.util.Scanner;
public class ArithmeticProg {
    public static void main(String[] args) {
        //TASK 7
        Scanner in = new Scanner(System.in);
        
        System.out.print("Insert integer A: ");
        int a = in.nextInt();
        in.nextLine();
        
        System.out.print("Insert integer B: ");
        int b = in.nextInt();
        in.nextLine();
        
        System.out.print("Insert integer C: ");
        int c = in.nextInt();
        in.nextLine();
        
        System.out.print("Insert integer D: ");
        int d = in.nextInt();
        in.nextLine();
        in.close();
        
        System.out.println("");
        System.out.println("##########Pre-Increment##########");
        System.out.println("Initital Value A: "+ a);
        System.out.println("Value after i++: "+ (a++));
        System.out.println("Final value of A: "+ a);
        
        System.out.println("");
        System.out.println("##########Post-Increment##########");
        System.out.println("Initial value B: "+ b);
        System.out.println("Value after ++i: "+ (++b));
        System.out.println("Final value of B: "+ b);
        
        System.out.println("");
        System.out.println("##########Pre-Decrement##########");
        System.out.println("Initial Value C: "+ c);
        System.out.println("Value after i--:"+ (c--));
        System.out.println("Final value of C: "+ c);
        
        System.out.println("");
        System.out.println("##########Post-Decrement##########");
        System.out.println("Initial value D: "+ d);
        System.out.println("Value after --i: "+ (--d));
        System.out.println("Final value of D: "+ d);
    }
}
       
     
    

