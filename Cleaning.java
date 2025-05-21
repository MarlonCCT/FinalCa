/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package products;

/**
 *
 * @author marlon_k
 */
//Cleaning class extends Product class
//Basically is a kind of Product
public class Cleaning extends Product {
    
    //Cleaning products have diferent surface type so I'm trying to separate them by types
    //Create a variable to store the type of the surface is made for
    private String surfaceType;

    //Create a Constructor for the class
    //Using 3 parameters: name, price and surfaceType
    public Cleaning(String name, double price, String surfaceType) {
        //As i create a contructor in Product superclass i can just call it for name and price
        super(name, price);
        //Set the surface type 
        this.surfaceType = surfaceType;
    }
    //One of the tasks was create a override method
    //Create a method to override the toString from Product class
    //I call using super.toString to get the name and price
    //And then i add " (For: " + surfaceType + ")"; to the end of the string 
    @Override
    public String toString() {
        
    //Returns the string of the product with the surface type
        return super.toString() + " (For: " + surfaceType + ")";
    }
}