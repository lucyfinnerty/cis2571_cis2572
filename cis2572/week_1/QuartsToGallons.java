/*
 * Author: Lucy Finnerty
 * This program calculates the number of gallons and quarts of paint needed for a painting job.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuartsToGallons {

    public static void main(String[] args) {
        final int NUMBER_OF_QUARTS = 4; // 1 gallon = 4 quarts
        int paintingJobQuarts = 0; // to store user input
        boolean validInput = false; // to track when input is valid
        @SuppressWarnings("resource")
        Scanner inputDevice = new Scanner(System.in);

        while(!validInput) { // loop until input is valid
            try { // prompt user for number of quarts needed
                System.out.println("How many quarts of paint do you need for the painting job?");
                paintingJobQuarts = inputDevice.nextInt(); // read and store user input
                validInput = true; // input is valid, exit loop
            } catch(InputMismatchException e) { // handle non-integer input
                System.out.println("Error: Invalid input. Please try again!"); // ask user to try again
                inputDevice.next(); // clear invalid input
            }
        }
        // calculate number of gallons and remaining quarts needed
        int gallons = paintingJobQuarts / NUMBER_OF_QUARTS;
        int quarts = paintingJobQuarts % NUMBER_OF_QUARTS;
        
        // display results to user
        System.out.println("A painting job that needs to use " + paintingJobQuarts + " quarts requires "
                + gallons + " gallons and " + quarts + " quarts of paint.");
    }
}