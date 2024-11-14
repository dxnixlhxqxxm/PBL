/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgclass;

/**
 *
 * @author Daniel Haqeem
 */
import java.util.Scanner;
public class Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner read =  new Scanner(System.in);
        
        //Menu
        System.out.println("Converter available :");
        System.out.println("1. Currency (MYR - YEN");
        System.out.println("2. Mass (kg - pound");
        System.out.println("3. Distance (km - m");
        
        //Input option
        System.out.print("Choose your converter : ");
        int convert = read.nextInt();
        read.nextLine(); 
        
        System.out.print("Insert Amount/Quantity : RM ");
        int amount = read.nextInt();
        read.nextLine();
        
        //Procedure
        switch(convert){
                case 1:
                double exchangeRate = 32.3588; // Exchange rate for MYR to JPY
                double result = amount * exchangeRate;
                System.out.println("");
                System.out.println("RM"+ amount + " = " + result + (" JYP "));
                break;
            case 2:
                // Assuming conversion rate: 1 kg = 2.20462 pounds
                double pounds = amount * 2.20462;
                System.out.println("KG to pound is " + pounds);
                break;
            case 3:
                // Assuming conversion rate: 1 km = 1000 meters
                double meters = amount * 1000;
                System.out.println("KM to m is " + meters);
                break;
            default:
                System.out.println("Invalid option chosen.");
                break;
            
        }
                
    }
    
}
