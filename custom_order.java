// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      // System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	 Scanner sc = new Scanner(System.in);
	 String firstName;
	 String itemOrder;
	 String frostingType;
	 String fillingType;
	 String toppings;
	 String input;
	 
	 double cost = 15.00;
	 final double TAX_RATE = .08;
	 double tax;

	 
    // Introduce shop and prompt user to input first name
      	System.out.println("Welcome to java's cake and cupcake shop!");
      	System.out.println("We make custom cakes with our secret cake batter!");
	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
	  
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

	
      

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

  
	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

   
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING


	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS


	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION
	System.out.println();
	System.out.println(firstName + " , your order is as follows: ");
	System.out.println("_________________________________________");
	System.out.println("Item Ordered: " + itemOrder);
	System.out.println("Frosting: " + frostingType);
	System.out.println("Filling: " + fillingType);
	System.out.println("Toppings: " + toppings);
	System.out.println("_________________________________________");

      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
  	System.out.printf("The cost of your order is: $%.2f\n", cost);
	tax = cost * TAX_RATE;
	System.out.printf("The tax is: $%.2f\n", tax);
	System.out.printf("The total due is: $%.2f\n",(tax + cost));
    }   
}
