// Name: Lucy Finnerty
// Date: 11/18/24
// Purpose: This program validates user input to create a new array. A NumberFormatException is thrown
// when a nonnumeric value is entered, as well a NegativeArraySizeException when a negative value is given.
import java.util.Scanner;
public class NegativeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // new scanner object to read user input
        // infinite loop to allow the user to try again until valid input is provided
        while(true) {
            System.out.print("Enter the preferred size of your new array: "); // prompt user for a size
            String sizeInput = input.nextLine(); // Read the input as a string to validate it later

            try {
                int size = Integer.parseInt(sizeInput); // attempt to parse the input as an integer
                int[] arr = new int[size]; // try to create an array of the specified size
                System.out.println("An array with a size of " + size +" has been created."); // display message that the new array was created
                break; // program terminates
            } catch(NumberFormatException e) { // thrown if user enters a nonnumeric value and allows them to try again
                System.err.println("Cannot use a nonnumeric value for size of an array. Please try again.");
            } catch(NegativeArraySizeException e) { // thrown if user enters a negative value and allows them to try again
                System.err.println("Cannot create an array with a negative size. Please try again.");
            }
        }
    }
}