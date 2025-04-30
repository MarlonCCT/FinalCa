/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

/**
 *
 * @author marlon_k
 */
public class Menu {
    
    //create a statistic method called ShowMenu
    //by using statistic mehotod we dont need to create a object to call it.
   public static void showMenu() {
       //as you said in class print message dont need coments.
        System.out.println("\nWelcome to the Supermarket!");// /n for new line
        System.out.println("1. Buy Banana ($1.50)");
        System.out.println("2. Buy Detergent ($3.99)");
        System.out.println("3. Buy Toilet Paper ($2.49)");
        System.out.println("4. Proceed to Checkout");
        System.out.print("Choose an option: ");
    }
}