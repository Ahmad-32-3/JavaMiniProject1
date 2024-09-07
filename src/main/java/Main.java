/*
Filename: W6U2A2_MuhammadAhmad_SumElements
Author:  Muhammad Ahmad
Date: Tuesday, March 26, 2024
Purpose: To create a program that uses arrays to edit lists
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

  // Print method
  public static void print(String message) {
    System.out.println(message);
  }
  
  public static void main(String[] args) {
    // Create Array Lists
    ArrayList <Integer> integerArrayList = new ArrayList<Integer>();
    ArrayList <Integer> evenIntegerArrayList = new ArrayList<Integer>();
    ArrayList <Integer> oddIntegerArrayList = new ArrayList<Integer>();

    // Set scanner to keyedInput
    Scanner keyedInput = new Scanner(System.in);

    // Initialize variables
    int userInput;
    int userChoice;
    int sum;
    
    // While loop to keep giving user a menu of options
    while (true) {
      System.out.print(
      "\nInput the corrosponding number for the action you want accordingly\n" +
        "1. Add an integer to the list\n" +
        "2. Remove an integer from the list\n" +
        "3. Display integers from lowest to highest in the list and the sum of all integers\n" +
        "4. Display even integer elements from lowest to highest in the list and the sum of all even integer elements\n" +
        "5. Display odd integer elements from lowest to highest in the list and the sum of all odd integer elements\n" +
        "6. Output the current list of integers\n" +
        "7. Exit the code\n\n" +
        "Enter the number: "
      );

      // Take user choice
      userChoice = keyedInput.nextInt();

      // Set sum to 0 before each iteration
      sum = 0;
      switch (userChoice) {
        case 1:
          print("\nEnter the integer to add to the list: ");
          userInput = keyedInput.nextInt();
          // Add userinput to arraylist
          integerArrayList.add(userInput);
          break;
        case 2:
          // Output arraylst for clarity
          System.out.print(integerArrayList);
          print("\nRefer to the above ArrayList, please enter the number you want to remove: ");
          userInput = keyedInput.nextInt();
          // Remove userinput from arraylist
          integerArrayList.remove(Integer.valueOf(userInput));
          break;
        case 3:
          // Sort from least to greatest using collections library
          Collections.sort(integerArrayList);
          print("\nThe integers sorted from least to greatest are: " + integerArrayList);

          // Iterates through index using an advanced for loop: sets i to each index through iterations and adds it to sum
          for (Integer i: integerArrayList) {
            sum += i;
          }

          print("The sum of all integers are: " + sum);
          break;

        case 4:
          // Clear the even arraylist before adding stuff to it
          evenIntegerArrayList.clear();
          // Sorts from least to greatest
          Collections.sort(integerArrayList);
          // Sets i to each index through iterations and adds it to sum
          for (Integer i: integerArrayList) {
            // if there is no remainder, then add the number associated with the index to sum and to even integer arraylist
            if (i%2 == 0) {
              sum += i;
              evenIntegerArrayList.add(i);
              
            }
          }
          print("\nThe even integers sorted from least to greatest are: " + evenIntegerArrayList);
          print("The sum of the even integers are: " + sum);
          break;

        case 5:
          // Clear the odd arraylist before adding stuff to it
          oddIntegerArrayList.clear();
          // Sorts from least to greatest
          Collections.sort(integerArrayList);
          // if there is a remainder, then add the number associated with the index to sum and to even integer arraylist
          for (Integer i: integerArrayList) {
            if (i%2 != 0) {
              sum += i;
              oddIntegerArrayList.add(i);
            }
          }
          print("\nThe odd integers sorted from least to greatest are: " + oddIntegerArrayList);
          print("The sum of the even integers are: " + sum);
          break;

        case 6:
          print("The current integers in the array list are: " + integerArrayList);
          break;
        case 7:
          print("\nThe program has ended, have a nice day");
          // Exit code
          System.exit(0);
        default:
          print("Invalid operation, please try again.");
      }
    }
  }
}