/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

/**
 *
 * @author marlon_k
 */


//Import all the classes from product package
//So I can use Food, Cleaning and Product directly
import products.*;

//Create a class called Price
public class Price {
    
    //Create a public method that returns a Food Object
    //By using static I can call the mothod without creating a new object in class price.
    public static Food getBanana() {
        
        //Now it returns a new object with the name "Banana" and the price 1.50
        //I also add a expiry date that will be combined with the toString message in Food class
        return new Food("Banana", 1.50, "In 3 days");
    }
    //Same here
    //And I added a message with the surface type that will be combined with the toString message in Cleaning class
    public static Cleaning getDetergent() {
        
        //It returns a new cleaning product called "Detergent" with the price of 3.99 
        return new Cleaning("Detergent", 3.99, "Kitchen");
    }
    //Same as before but in this case I just added a name and price. No message 
    public static Product getToiletPaper() {
        return new Product("Toilet Paper", 2.49);
    }
}