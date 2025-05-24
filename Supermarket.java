/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package shopping;

/**
 *
 * @author kheal
 */
 import products.*;
 //Import classes from product package
 import java.util.Scanner;
 //Import the Scanner to read user input from the keyboard
 
 
public class Supermarket {
//Declaring the main class of my program 

    public static void main(String[] args) {
     //Creating a main method. Where is where the program start
        
        ShoppingTrolley myBag = new ShoppingTrolley();
        //Creating myBag. where the user can buy things to put in it
       
        Scanner scanner = new Scanner(System.in);
        //Creating a scanner to read the input from user
        
        boolean shopping = true;
        //Set a variable to control the loop. If it's true means that the user still shopping
        
        double totalCost = 0.0;
        //Set a variable to store the cost of everything the user buy 

        while (shopping) {
        //Create a loop and the loop runs while the user is shopping (true)
        
            Menu.showMenu();
            //Display the menu from menu class
        
            int choice = scanner.nextInt();
            //Read the user's choice 

            switch (choice) {
            //Using the user choice I create a switch statement to manage multiple options
            //Each "case" represents one option of the menu. Much more easier than using many if/else
    
                case 1 -> {
                //case 1 if the user input = 1
                
                    System.out.print("How many bananas would you like? ");
                    //Print a message asking the quantity
                    
                    int qty = scanner.nextInt();
                    //Read the quantity
                    
                    for (int i = 0; i < qty; i++) {
                        //creating a loop. Inicial value = 0, i++ means that the inicial value will increase 1 after each loop 
                        //loop will stop when inicial value is reaches the quantity   
                        Food banana = Price.getBanana();
                        //get a banana object all time when the loop runs.
                        
                        if (qty >= 5) {
                            //If the quantity is equal or bigger than 5 apply discount (Created in product class)
                            banana.applyDiscount();
                        }
                        myBag.buyItem(banana);
                        //We add the item in my bag
                        
                        totalCost += banana.getPrice();
                        //Add the cost of item in total cost
                    }
                }
                case 2 -> {
                    //Same loop that I did in case one but it will run if the input of user is equal to 2
                    System.out.print("How many detergents would you like? ");
                    int qty = scanner.nextInt();
                    for (int i = 0; i < qty; i++) {
                        Cleaning detergent = Price.getDetergent();
                        if (qty >= 5) {
                            detergent.applyDiscount();
                        }
                        myBag.buyItem(detergent);
                        totalCost += detergent.getPrice();
                    }
                }
                case 3 -> {
                     //Same loop that I did in case one but it will run if the input of user is equal to 3
                    System.out.print("How many toilet paper packs would you like? ");
                    int qty = scanner.nextInt();
                    for (int i = 0; i < qty; i++) {
                        Product toiletPaper = Price.getToiletPaper();
                        if (qty >= 5) {
                            toiletPaper.applyDiscount();
                        }
                        myBag.buyItem(toiletPaper);
                        totalCost += toiletPaper.getPrice();
                    }
                }
                case 4 -> {
                    //For the case of user input = 4 
                    
                    System.out.println("\n--- Checkout ---");
                    //Print the message "Checkout" /n is to break/new line 
                    
                    System.out.println(myBag.emptyTrolley());
                    //Print the itens from mybag "trolley" and after clear the bag with emptyTrolley()
                    
                    System.out.printf("Total amount due: $%.2f\n", totalCost);
                    //Now I'm going to show the total cost. But before I'll print a message and give instructions
                    //$ Will be apperears in front of the total cost to say that the number is money 
                    //% Basicly means a place holder for a variable
                    //.2f It will give to us a number with 2 digits after the decimal point
                    //I coudn't remeber if we learned .2f in class but I looked it up and I found that this was the easiest way to 
                    //work with numbers as a monetary value. For exaple 2.5 now will appears like $2.50
                    
                    //We still in the case 4 so if the user went trhow this the value of shopping will change
                    //To false. It means that the user finish shopping and we can exit the loop.
                    shopping = false;
                }
                //We must have a option if the user press something that is not in range from 1-4
                //Even if you clearly explain how the prgram works, user can input random things that if 
                //you don't have something to catch it you program will crash
                default -> System.out.println("Invalid option. Please choose again.");
            }
        }

    }
}