/*  Author: Michael Molchan
 *  Course: CIS 2212-800 Java I FlexPace
 *  Lab: Assignment 02 - Calculator
 *  Due Date: FlexPace
 *  Submitted: April 25, 2023
 */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean calculatorOn = true;
        double inputOne;
        double inputTwo;


        if (calculatorOn)
        {
            System.out.println(
                    "Menu\n" +
                    "1. Add\n" +
                    "2. Subtract\n" +
                    "3. Multiply\n" +
                    "4. Divide\n" +
                    "5. Generate Random Number\n");

            int menuChoice = input.nextInt();
            switch (menuChoice) {
                case 1:
                    //User Inputs
                    System.out.println("------Addition------");
                    System.out.print("What is your first number: ");
                    inputOne = input.nextDouble();
                    System.out.print("\nWhat is your second number: ");
                    inputTwo = input.nextDouble();
                    //Addition Output
                    System.out.println("Your two values added are: " + (inputOne + inputTwo));
                    break;
                case 2:
                    //User Inputs
                    System.out.println("------Subtraction------");
                    System.out.print("What is your first number: ");
                    inputOne = input.nextDouble();
                    System.out.print("\nWhat is your second number: ");
                    inputTwo = input.nextDouble();
                    //Subtraction Output
                    System.out.println("Your two values subtracted are: " + (inputOne - inputTwo));
                    break;
                case 3:
                    //User Inputs
                    System.out.println("------Multiplication------");
                    System.out.print("What is your first number: ");
                    inputOne = input.nextDouble();
                    System.out.print("\nWhat is your second number: ");
                    inputTwo = input.nextDouble();
                    //Multiplication Output
                    System.out.println("Your two values multiplied are: " + (inputOne * inputTwo));
                    break;
                case 4:
                    //User Inputs
                    System.out.println("------Division------");
                    System.out.print("What is your first number: ");
                    inputOne = input.nextDouble();
                    System.out.print("\nWhat is your second number: ");
                    inputTwo = input.nextDouble();
                    //Division Output and if statement to prevent dividing by 0
                    if (inputTwo == 0)
                    {
                        System.out.println("You cant divide by 0");
                    }
                    else
                    {
                        System.out.println("Your two values divided are: " + (inputOne / inputTwo));
                    }
                    break;
                case 5:
                    //User Inputs
                    System.out.println("------Randomizer------");
                    System.out.print("What is your lower limit: ");
                    inputOne = input.nextDouble();
                    System.out.print("\nWhat is your upper limit: ");
                    inputTwo = input.nextDouble();
                    //Randomizer Output
                    System.out.println("Your random number is: " + (inputOne + Math.random() * (inputTwo - inputOne)));
                    break;
                default:
                    System.out.println("You didn't enter a number from 1 to 5");
            }
        }

    }
}