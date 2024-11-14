/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deduction;

/**
 *
 * @author Daniel Haqeem
 */
import java.util.Scanner;
public class Deduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
       
        //Declaration
        String item = null;
        float price = 0;
        float total_price;
        int quan;
        try{
            //Menu
       System.out.println("###################################");
       System.out.println("|     WELCOME TO PUPU'S MART      |");
       System.out.println("|        Here is our menu:        |");
       System.out.println("###################################");
       System.out.println("|         1. Tissue - RM3         |");
       System.out.println("|         2. Broom  - RM5         |");
       System.out.println("|         3. Bag    - RM9         |");
       System.out.println("|                                 |");
       System.out.println("###################################");
       
       //Input menu option
       System.out.print("Enter your option: ");
       int button = read.nextInt();
       read.nextLine();
       
       //Procedure
       switch(button){
           case 1: item = "Tissue"; price = 3;break;
           case 2: item = "Broom"; price = 5;break;
           case 3: item = "Bag"; price = 9;break;
       }
       //Input quantity of the item
       System.out.print("Enter your quantity for the item: ");
       quan = read.nextInt();
       read.nextLine();
       
       //Formula
        total_price = quan * price;
       
       //Output
       System.out.println("Your item is "+ item);
       System.out.println("Item per price: "+ price);
       System.out.println("Quantity: "+ quan);
       System.out.println("Total price: "+ total_price);
            
        }
        catch(Exception ae){
            System.out.println("Invalid input");
            
        }
        
 }
}       
        /*
        int month=4;
        
                
        switch(month){
            case 1: System.out.println("January");break;
            case 2: System.out.println("February");break;
            case 3: System.out.println("March");break;
            case 4: System.out.println("April");break;
            case 5:System.out.println("May");break;
            case 6: System.out.println("June");break;
            case 7: System.out.println("July");break;
            case 8: System.out.println("August");break;
            case 9: System.out.println("September");break;
            case 10: System.out.println("October");break;
            case 11: System.out.println("November");break;
            case 12: System.out.println("December");break;
            default: System.out.println("Error");
        }
        */
        
        /*
        Scanner read =  new Scanner(System.in);
        
        //Input marks
        System.out.print("Insert your marks: ");
        float grade = read.nextFloat();
        read.nextLine();
        
        //Figuring grades
        if (grade >= 85){
            System.out.println("");
            System.out.println("Your grade is A");
                    
        } else if (grade >= 80){
            System.out.println("");
            System.out.println("Your grade is A-");
        } else if (grade >= 75){
            System.out.println("");
            System.out.println("Your grade is B+");
        } else if (grade >= 70){
            System.out.println("");
            System.out.println("Your grade is B");
        } else if (grade >= 65){
            System.out.println("");
            System.out.println("Your grade is B-");
        }else if (grade >= 60){
            System.out.println("");
            System.out.println("Your grade is C+");
        }else if (grade >= 55){
            System.out.println("");
            System.out.println("Your grade is C");
        }else if (grade >=50){
            System.out.println("");
            System.out.println("Your grade is C-");
        }else if (grade >= 45){
            System.out.println("");
            System.out.println("Your grade is D");
        }else if (grade >= 40){
            System.out.println("");
            System.out.println("Your grade is D-");
        }else{
            System.out.println("");
            System.out.println("Your grade is E");
        }*/
        
        /*
        Scanner read =  new Scanner(System.in);
        
        //User input x
        System.out.print("Insert your first integer: ");
        int x = read.nextInt();
        read.nextLine();
        
        //User input y
        System.out.print("Insert your second integer: ");
        int y = read.nextInt();
        read.nextLine();
       
        //Formula
        int sum = x+y;
        int substract = x-y;
        int product = x*y;
        double quotient = (double) x/y;
        int remainder = x%y;
        
        //Menu
        System.out.println("");
        System.out.println("############### MENU ###############");
        System.out.println("      --Pick your operation--");
        System.out.println("            1.Addition        ");
        System.out.println("            2.Substraction        ");
        System.out.println("            3.Multiplication        ");
        System.out.println("            4.Division        ");
        System.out.println("            5.Remainder        ");
        System.out.println("####################################");
        
        //User input button based on the menu
        System.out.print("Choose your button: ");
        int button = read.nextInt();
        read.nextLine();
        read.close();
        
        //Procedure
        switch(button){
            case 1: System.out.println("Addition: "+ sum);break;
            case 2: System.out.println("Substraction: "+ substract);break;
            case 3: System.out.println("Multiplication: "+ product);break;
            case 4: System.out.println("Division: "+ quotient);break;
            case 5:System.out.println("Remainder: "+ remainder);break;
            default:System.out.print("Your input is wrong");break;
        }
        */
        
        /*
        Scanner read = new Scanner(System.in);
       
        //Declaration
        String item = null;
        float price = 0;
        float total_price;
        int quan;
        
        //Menu
       System.out.println("###################################");
       System.out.println("|     WELCOME TO PUPU'S MART      |");
       System.out.println("|        Here is our menu:        |");
       System.out.println("###################################");
       System.out.println("|         1. Tissue - RM3         |");
       System.out.println("|         2. Broom  - RM5         |");
       System.out.println("|         3. Bag    - RM9         |");
       System.out.println("|                                 |");
       System.out.println("###################################");
       
       //Input menu option
       System.out.print("Enter your option: ");
       int button = read.nextInt();
       read.nextLine();
       
       //Procedure
       switch(button){
           case 1: item = "Tissue"; price = 3;break;
           case 2: item = "Broom"; price = 5;break;
           case 3: item = "Bag"; price = 9;break;
       }
       //Input quantity of the item
       System.out.println("Enter your quantity for the item: ");
       quan = read.nextInt();
       read.nextLine();
       
       //Formula
        total_price = quan * price;
       
       //Output
       System.out.println("Your item is: "+ item);
       System.out.println("Item per price: "+ price);
       System.out.println("Quantity: "+ quan);
       System.out.println("Total price: "+ total_price);
       
       */
    
