/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package averagecalculator;

/**
 *
 * @author Daniel Haqeem
 */
import java.util.Scanner;

public class Calculator {
    public static void calculation() {
        Scanner read = new Scanner(System.in);

        int[][] marks = new int[3][3]; // 2D array for 3 students and 3 marks each
        double[] averageMarks = new double[3]; // Array to store the average marks for each student

        // Loop to input marks for each student
        for (int i = 0; i < 3; i++) {  // Loop for each student
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            int sum = 0;  // Variable to store the sum of marks for each student
            
            for (int j = 0; j < 3; j++) {  // Loop for each mark
                System.out.print("Mark " + (j + 1) + ": ");
                marks[i][j] = read.nextInt();
                sum += marks[i][j];  // Sum up marks for each student
            }
            
            // Calculate average marks for each student
            averageMarks[i] = sum / 3.0;
        }

        // Find the highest and lowest average using Math class methods
        findHighestAndLowestAverage(averageMarks);

        read.close(); // Close the scanner
    }

    // Method to find the highest and lowest averages using Math class
    public static void findHighestAndLowestAverage(double[] averageMarks) {
        double highestAverage = Math.max(Math.max(averageMarks[0], averageMarks[1]), averageMarks[2]);
        double lowestAverage = Math.min(Math.min(averageMarks[0], averageMarks[1]), averageMarks[2]);

        System.out.println("\nHighest Average: " + highestAverage);
        System.out.println("Lowest Average: " + lowestAverage);
    }
}

    
        
    

