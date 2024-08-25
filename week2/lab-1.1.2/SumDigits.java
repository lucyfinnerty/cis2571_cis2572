// Name: Lucy Finnerty
// Date: 8/23/24
// Purpose: To sum all of the digits from an integer of the user's choice and display the result
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        // new scanner object to read user input
        Scanner input = new Scanner(System.in);
        // ask user to enter an integer between 0 and 1000
        System.out.println("Enter a number between 0 and 1000: ");
        // set num variable to user input
        int num = input.nextInt();
        // new variable sum, which is the sum of all digits of the user's integer
        int sum = 0;
        // while num is between 0 and 1000, calculate the sum of all digits
        while (num > 0 && num < 1000) {
            sum = sum + num % 10;
            num = num / 10;
        }
        // display output to user
        System.out.println("The sum of the digits is " + sum);
    }
}
