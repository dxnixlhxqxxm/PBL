/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_converter;

/**
 *
 * @author Daniel Haqeem
 */
import java.util.Scanner;
public class Calculation {
    public static void calculate(){
        //Input option
        Scanner read =  new Scanner(System.in);
        System.out.print("Your option: ");
        int pilih = read.nextInt();
        
        //Declaration
        
        
        
        switch (pilih){
            case 1 -> {
                System.out.print("Insert your distance(m):");//Input value for distance
                float DistanceInput = 0;
                DistanceInput = read.nextFloat();
                float distance = DistanceInput/1000;//Declaration and formula
                System.out.println(distance + "km");
                
            }
            case 2 ->{
                System.out.print("Insert your value in Celcius:");//Input value for Fahrenheit
                float CelciusInput = 0;
                CelciusInput = read.nextFloat();
                float fahren = CelciusInput * 9/5 + 32;//Declaration and formula
                System.out.println(fahren);
            }
            case 3 ->{
                System.out.print("Insert value in Fahrenheit:");//Input value for Celcius
                float FahrenInput = 0;
                FahrenInput = read.nextFloat();
                float celcius = FahrenInput * 9/5 + 32;//Declaration and formula
                System.out.println(celcius);
            }
            
        }
            
        
        
        
    }
    
}
