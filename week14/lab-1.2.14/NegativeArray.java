// Name: Lucy Finnerty
// Date: 11/18/24
// Purpose:

import java.util.Scanner;

public class NegativeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter the preferred size of your new array: ");
            String sizeInput = input.nextLine();

            try {
                int size = Integer.parseInt(sizeInput);
                int[] arr = new int[size];
                System.out.println("An array with a size of " + size +" has been created.");
                break;
            } catch(NumberFormatException e) {
                System.err.println("Cannot use a nonnumeric value for size of an array. Please try again.");
            } catch(NegativeArraySizeException e) {
                System.err.println("Cannot create an array with a negative size. Please try again.");
            }
        }
    }
}