// import 
import java.util.*;  
/**
 * Class Microwave.
* This program calculates and displays the amount of time 
* it takes to heat each item given the quantity specified by the user.
* @author  John Junior Omage
* @version 1.0
* @since   2020-09-21
*/

public class Microwave {

  /**
   * Required javadoc.
  */

  // Declare variables
  static double ITEMSUB = 60;
  static double ITEMPIZZA = 45;
  static double ITEMSOUP = 105;
  static double TWOITEMS = 1.5;
  static double THREEITEMS = 2;

  static double itemPicked = 0;
  static double quantityItem = 0;
  static double cookTime = 0;

  /**
  */
  
  public static void main(String[] args) {
      
    // Allow the user to put an input
    Scanner userInput = new Scanner(System.in);
      
    // Ask user for which item they want to eat
    System.out.println("Which item do you want? 1 = sub, 2 = pizza, 3 = soup");

    // Set user's input to the item picked
    itemPicked = userInput.nextDouble();

    // If Else Statements depending on what item the user chose
    if (itemPicked == ITEMSUB) {
      // Ask the user how many of that item they want
      System.out.println("How many sub(s) are you heating? Choose from 1 to 3.");

      // Set user's input to the quantity item
      quantityItem = userInput.nextDouble();

      // Calculate the total cook time
      if (quantityItem == 1) {
        // Calculate the total cook time
        cookTime = ITEMSUB;
      } else if (quantityItem == 2) {
        // Calculate the total cook time
        cookTime = ITEMSUB * TWOITEMS;
      } else if (quantityItem == 3) {
        // Calculate the total cook time
        cookTime = ITEMSUB * THREEITEMS;
      } else {
        // Display error
        System.out.println("Error, restart application");
        
        // Exit 
        System.exit(0);
      }
    } else if (itemPicked == ITEMPIZZA) {
      // Ask the user how many of that item they want
      System.out.println("How many pizza(s) are you heating? Choose from 1 to 3.");

      // Set user's input to the quantity item
      quantityItem = userInput.nextDouble();

      // Calculate the total cook time
      if (quantityItem == 1) {
        // Calculate the total cook time
        cookTime = ITEMPIZZA;
      } else if (quantityItem == 2) {
        // Calculate the total cook time
        cookTime = ITEMPIZZA * TWOITEMS;
      } else if (quantityItem == 3) {
        // Calculate the total cook time
        cookTime = ITEMPIZZA * THREEITEMS;
      } else {
        // Display error
        System.out.println("Error, restart application");

        // Exit 
        System.exit(0);
      }
    } else {
      // Ask the user how many of that item they want
      System.out.println("How many soup(s) are you heating? Choose from 1 to 3.");

      // Set user's input to the quantity item
      quantityItem = userInput.nextDouble();

      // Calculate the total cook time
      if (quantityItem == 1) {
        // Calculate the total cook time
        cookTime = ITEMSOUP;
      } else if (quantityItem == 2) {
        // Calculate the total cook time
        cookTime = ITEMSOUP * TWOITEMS;
      } else if (quantityItem == 3) {
        // Calculate the total cook time
        cookTime = ITEMSOUP * THREEITEMS;
      } else {
        
        // Display error
        System.out.println("Error, restart application");

        // Exit 
        System.exit(0);
      } 
      
      // Display the cook time
      System.out.println("The cooktime is: " + cookTime);

    }
  }
}