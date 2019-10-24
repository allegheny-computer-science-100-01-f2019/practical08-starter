package practicaleight;

import java.util.Date;
import java.util.Scanner;

/**
 * The DisplaySymbolsMain class contains the main method
 * that calls methods in another class to display triangles.
 **/
public class DisplaySymbolsMain {

  /**
   * Call the methods to perform user input and display the symbols correctly.
   * The program will get the input from the user and
   * it will also display output about reading from the file.
   **/
  public static void main(String[] args) {

    // Step One: Display a welcome message
    System.out.println("Add Your Name Here " + new Date());
    System.out.println();

    // Step Two: Get the symbol from the user
    System.out.println("Please enter a symbol to display.");
    String chosenSymbol;
    Scanner scanner = new Scanner(System.in);
    chosenSymbol = scanner.next();
    System.out.println("Okay, I read in the symbol " + chosenSymbol + ".");
    System.out.println();

    // Step Three: Get the number of symbols from the user
    System.out.println("Please enter the number of rows to display.");
    int chosenRows;
    chosenRows = scanner.nextInt();
    System.out.println("Okay, I read in the row count of " + chosenRows + ".");
    System.out.println();

    // TODO Step Four: Create an instance of the DisplaySymbols class
    DisplaySymbols display = new DisplaySymbols();

    System.out.println("Now, I will display a single triangle.");
    System.out.println();
    // TODO Step Five: Call a method to display the single triangular shape here
    System.out.println();

    System.out.println("Now, I will display a double triangle.");
    System.out.println();
    // TODO Step Six: Call a method to display the double triangular shape here
    System.out.println();

    // TODO Step Seven: Display the closing message
  }
}
