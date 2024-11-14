/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author Daniel Haqeem
 */
import java.util.Scanner;
    public class minandmax {
    public static void numbers(){
    Scanner read = new Scanner(System.in);

        // Prompt user to input three integers
        System.out.println("Enter the first integer: ");
        int num1 = read.nextInt();

        System.out.println("Enter the second integer: ");
        int num2 = read.nextInt();

        System.out.println("Enter the third integer: ");
        int num3 = read.nextInt();

        // Use Math.max() and Math.min() to find the maximum and minimum
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));

        // Display the results
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);

        // Close the scanner
        read.close();
    }
}
    