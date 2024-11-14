/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q3;

/**
 *
 * @author Daniel Haqeem
 */
import java.util.Scanner;
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int[] marks = new int[10];//Integer declaration

        System.out.println("Enter 10 marks:");//Looping for input = 10
        for (int i = 0; i < 10; i++) {
            marks[i] = read.nextInt();
        }

        int[] gradeCounts = countGrades(marks);

        displayGrades(gradeCounts);
    }

    public static int[] countGrades(int[] marks) {
        int[] gradeCounts = new int[5]; // A, B, C, D, E

        for (int mark : marks) {//to know the grade place based from the input
            char grade = getGrade(mark);
            switch (grade) {
                case 'A':
                    gradeCounts[0]++;
                    break;
                case 'B':
                    gradeCounts[1]++;
                    break;
                case 'C':
                    gradeCounts[2]++;
                    break;
                case 'D':
                    gradeCounts[3]++;
                    break;
                case 'E':
                    gradeCounts[4]++;
                    break;
            }
        }

        return gradeCounts;
    }

    public static char getGrade(int mark) {//To know the grade level
        if (mark >= 90) {
            return 'A';
        } else if (mark >= 80) {
            return 'B';
        } else if (mark >= 70) {
            return 'C';
        } else if (mark >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public static void displayGrades(int[] gradeCounts) {//Output
        System.out.println("Out of 10:");
        System.out.println("Grade A: " + gradeCounts[0]);
        System.out.println("Grade B: " + gradeCounts[1]);
        System.out.println("Grade C: " + gradeCounts[2]);
        System.out.println("Grade D: " + gradeCounts[3]);
        System.out.println("Grade E: " + gradeCounts[4]);
    }
}
