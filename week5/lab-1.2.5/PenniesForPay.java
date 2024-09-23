// Name: Lucy Finnerty
// Date: 9/16/24
// Purpose: Program that calculates amount of pennies someone earns when the amount doubles for every day worked.
import java.util.Scanner;
public class PenniesForPay {
    public static void main(String[] args) {
        // new scanner object to read user input
        Scanner input = new Scanner(System.in);
        // ask user the amount of days worked for calculations and set it to integer variable 'days'
        System.out.print("For how many days will you work? ");
        int days = input.nextInt();
        // days must greater than 1
        while (days < 1) {
            System.out.println("The number of days must be at least 1.");
            System.out.print("For how many days will you work? ");
            days = input.nextInt();
        }
        int pennies = 1;  // salary in pennies starts at 1
        int totalPennies = 0;  // total salary in pennies

        // display the header for the table
        System.out.println("Day    Pennies Earned");

        // calculate and display the salary for each day
        for (int day = 1; day <= days; day++) {
            System.out.println(day + "      " + pennies);
            totalPennies += pennies;  // add today's salary to the total
            pennies *= 2;  // double the pennies for the next day
        }
        // convert the total pennies to dollars
        double totalDollars = totalPennies / 100.0;

        // display the total pay in dollars
        System.out.println("Total pay: $" + totalDollars);
        
    }
}
