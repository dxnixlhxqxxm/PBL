/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhileloopdemo;

/**
 *
 * @author Daniel Haqeem
 */
public class DoWhileLoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String searchMe ="One-one was a race horse. Two-two was one too. One-one won one race. Two-two won one too.";
        int max = searchMe.length();
        int numOs = 0;
        int numNs = 0;
        for (int i = 0; i<max; i++){
            if(searchMe.charAt(i)!= 'o')
                continue;numOs++;
            
        }for (int a = 0; a <max; a++){
        if(searchMe.charAt(a) !='n')
            continue;numNs++;
    }
        System.out.println("Found " + numOs+ " o's and n's in the string");
        System.out.println("Found " + numNs+ " o's and n's in the string");
        System.out.println(max);
       */
        /*
        int result;
        for (int i =1;i<=10;i++){
            result = square(i);
            System.out.println("The square of "+i+" is="+result+"\n");
        }
     }
public static int square(int y){
    return y*y;
} */
        
        int width = 20;  // Width of the wrapper
        int height = 10; // Height of the wrapper
        int middleHeight = 4; // Height of the decorative middle section

        // Top section
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Middle section (decorative)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 20; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Bottom section
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        
        
        /*
        // Using 'for' loop
        System.out.println("Using 'for' loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("");

        // Using 'while' loop
        System.out.println("Using 'while' loop:");
        int j = 1;
        while (j <= 10) {
            System.out.print(j+" ");
            j++;
        }
        System.out.println("");
        System.out.println("");

        // Using 'do-while' loop
        System.out.println("Using 'do-while' loop:");
        int k = 1;
        do {
            System.out.print(k +" ");
            k++;
        } while (k <= 10);
        System.out.println("");
        
        
        /*task2
        // Using 'for' loop
        int sumFor = 0;
        for (int i = 1; i <= 10; i++) {
            sumFor += i;
        }
        System.out.println("'for' loop: " + sumFor);

        // Using 'while' loop
        int sumWhile = 0;
        int j = 1;
        while (j <= 10) {
            sumWhile += j;
            j++;
        }
        System.out.println("'while' loop: " + sumWhile);

        // Using 'do-while' loop
        int sumDoWhile = 0;
        int k = 1;
        do {
            sumDoWhile += k;
            k++;
        } while (k <= 10);
        System.out.println("'do-while' loop: " + sumDoWhile);
        */
    }
}
        
    
