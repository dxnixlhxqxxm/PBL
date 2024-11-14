/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4;

/**
 *
 * @author Daniel Haqeem
 */
public class menu {
    public static void findHighestAndLowestAverage(double[] averageMarks) {
        double highestAverage = Math.max(Math.max(averageMarks[0], averageMarks[1]), averageMarks[2]);
        double lowestAverage = Math.min(Math.min(averageMarks[0], averageMarks[1]), averageMarks[2]);

        System.out.println("\nHighest Average: " + highestAverage);
        System.out.println("Lowest Average: " + lowestAverage);
    }
    
}
