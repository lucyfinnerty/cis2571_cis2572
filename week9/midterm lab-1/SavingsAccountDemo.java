// Name: Lucy Finnerty
// Date: 10/17/24
// Purpose: This program prompts the user to enter information about their account, calculates the
// numbers, and displays an account statement. This includes total amount deposited and withdrawn,
// total interest earned, and ending balance.
import java.util.Scanner;
public class SavingsAccountDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // new scanner object to read user input
        
        // ask user for the starting balance of their account and set it to the account's parameter
        System.out.print("Enter the savings account's starting balance $: ");
        SavingsAccount account = new SavingsAccount(input.nextDouble());
        
        // ask user for their account's interest rate and set it to a new variable
        System.out.print("Enter the savings account's annual interest rate %: ");
        double rate = input.nextDouble(); // user's interest rate
        
        // ask user how many months they've had the account and set the number to a new variable
        System.out.print("How many months have passed since account was opened? ");
        int months = input.nextInt(); // amount of months account has been open
        
        double deposited = 0; // amount of money deposited into account
        double withdrawn = 0; // amount of money withdrawn from account
        double depositedTotal = 0; // total amount of money deposited over a number of months
        double withdrawnTotal = 0; // total amount of money withdrawn over a number of months
        double interestEarnedTotal = 0; // total amount of monthly interest earned
        
        int count = 0; // counter for tracking the number of months processed
        while(count < months) { // loop through each month
            // ask the user to enter the deposit amount for the current month
            System.out.print("Enter the amount deposited during month "+ (count + 1) + ": ");
            deposited = input.nextDouble(); // get the deposit amount from the user
            account.deposit(deposited); // add the deposited amount to the account balance

            // ask the user to enter the withdrawn amount for the current month
            System.out.print("Enter the amount withdrawn during month "+ (count + 1) + ": ");
            withdrawn = input.nextDouble(); // get the withdrawal amount from the user
            account.withdraw(withdrawn); // subtract the withdrawn amount from the account balance

            depositedTotal += deposited; // add the current deposit to the running total of deposits
            withdrawnTotal += withdrawn; // add the current withdrawal to the running total of withdrawals

            // calculate the interest earned for the current month
            double interestEarned = account.monthlyInterest(rate);
            interestEarnedTotal += interestEarned; // accumulate the total interest earned
            account.deposit(interestEarned); // add the interest earned to the account balance for the current month

            count++; // increment the counter to move to the next month
        }
        // round interest earned and balance
        interestEarnedTotal = Math.round(interestEarnedTotal * 100.0) / 100.0;
        double endingBalance = Math.round(account.getBalance() * 100.0) / 100.0;
        // display account statement
        System.out.println("Total deposited: $" + depositedTotal);
        System.out.println("Total withdrawn: $" + withdrawnTotal);
        System.out.println("Interest earned: $" + interestEarnedTotal);
        System.out.println("Ending balance: $" + endingBalance);
    } 
}