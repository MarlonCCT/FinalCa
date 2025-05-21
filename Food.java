/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package products;

/**
 *
 * @author marlon_k
 */
//Here we are going to have almost the same structure as Cleaning class
//Food class extends Product class
//Food is a kind of product
public class Food extends Product {
    
    //Food products have different expiry dates
    //To be honest i search a lot because i would like to add something but i coudn't
    //I was looking for somthing for exemple
    //I run the code on 25/07/25 and the expiry date will appears like 3 days after like 28/07/25
    //I try to do that but i coudn't so I just add a message " expires in X days"
    private String expiryDate;

    //Create a contructor for the class
    //Using 3 paramets: name, price and expiryDate
    public Food(String name, double price, String expiryDate) {
        ////As i create a contructor in Product superclass i can just call it for name and price
        super(name, price);
        //Set the expiryDate
        this.expiryDate = expiryDate;
    }
    //I'm using the same explanation that i used on Cleaning class
    //One of the tasks was create a override method
    //Create a method to override the toString from Product class
    //I call using super.toString to get the name and price
    //And then i add " (Expires: " + expiryDate + ")"; to the end of the string 
    @Override
    public String toString() {
    ////Returns the string of the product with the expiryDate
        return super.toString() + " (Expires: " + expiryDate + ")";
    }
}