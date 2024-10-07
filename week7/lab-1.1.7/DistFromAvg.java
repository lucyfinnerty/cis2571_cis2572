// Name: Lucy Finnerty
// Date: 10/3/24
// Purpose: Allows user to enter up to 5 double numbers and will calculate each value's distance from the average
import java.util.Scanner;
public class DistFromAvg {
    public static void main(String[] args) {
        // new scanner object to read user input
        Scanner input = new Scanner(System.in);
        // array to store user's number (max of 5 numbers)
        double[] arr = new double[5];
        // counter for amount of numbers in array
        int count = 0;
        // sum of all of the numbers
        double sum = 0;
        // display opening statement
        System.out.println("Enter up to 5 double numbers (-9999 to quit):");
        // loop to get user input until 5 numbers are entered or until they quit
        while(count < 5) {
            // read double value user entered
            double num = input.nextDouble();
            // if user tried to quit without entering a number, ask them to try again
            if (num == -9999 && count == 0) {
                System.out.println("Must input at least one number (maximum is five). Try again:");
                continue;
            }
            // quit when user enters -9999 and count is greater than 0
            if (num == -9999 && count > 0) {
                break;
            }
            // store valid number in array and add it to the sum
            arr[count] = num;
            sum += num;
            count++; // increment count after storing number
        }
        // if at least one number has been entered, calculate and display the results
        if (count > 0) {
            double average = sum / count;
            // display headers
            System.out.print("Value        ");
            System.out.println("Distance from Average");
            // loop through entered numbers to calculate and display distance
            for (int i = 0; i < count; i++) {
                double distance = Math.abs(arr[i] - average);
                // display each entered value and its distance from the average
                System.out.print(arr[i]);
                System.out.print("          ");
                System.out.println(distance);
            }
        }
    }
}