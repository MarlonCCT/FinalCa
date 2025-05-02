/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package products;

/**
 *
 * @author marlon_k
 */
public class Product {
    
    // i was wordering to use private or protected. If i use private
    // i will have to make a getter and setter to let the other classes acess the value 
    // protected allows the subclasses to use the value directly                   
    protected String name; 
    protected double price;

    
    // first constructor of the program 
    // we call this when we need to create a new product
    // contrcutor get name and price and save it into the object
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // create a method to give a discount if the user 
    // buy more than 5 itens. In main class i will check the quantity and 
    // check if i can apply the discount.
    public void applyBulkDiscount() {
        this.price -= this.price * 0.10;
    }
    
    // create a method to retunt the price of the product 
    // it will be useful when we add total or when we want to show the price
    public double getPrice() {
        return price;
    }
    // create a mothod to turn the produtc in string 
    // by using that is easier to print price and product in same line
    public String toString() {
        return name + " - Price: €" + price;
    }
}