/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods;

/**
 *
 * @author Daniel Haqeem
 */
public class Methods {
    
    public static void main(String[] args) {
        //Calling out from GradeBook class
        GradeBook myGradeBook = new GradeBook();
        myGradeBook.displayMessage();
        
        //Calling out from Menu class
        Menu myMenu = new Menu();
        myMenu.displayMenu();
        
        //Calling out from OptionPane class
        Option tv = new Option();
        tv.displayOption();
        
    }
}


