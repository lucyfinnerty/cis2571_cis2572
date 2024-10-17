import java.util.Scanner;
public class SavingsAccountDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the savings account's starting balance $: ");
        SavingsAccount account = new SavingsAccount(input.nextDouble());
        System.out.print("Enter the savings account's annual interest rate %: ");
        double rate = input.nextDouble();
        System.out.print("How many months have passed since account was opened? ");
        int months = input.nextInt();
        
        int count = 0;
        double deposited = 0;
        double withdrawn = 0;
        double depositedTotal = 0;
        double withdrawnTotal = 0;
        double interestEarnedTotal = 0;
        
        while(count < months) {
            System.out.print("Enter the amount deposited during month "+ (count + 1) + ": ");
            deposited = input.nextDouble();
            account.deposit(deposited);

            System.out.print("Enter the amount withdrawn during month "+ (count + 1) + ": ");
            withdrawn = input.nextDouble();
            account.withdraw(withdrawn);

            depositedTotal += deposited;
            withdrawnTotal += withdrawn;

            double interestEarned = account.monthlyInterest(rate);
            interestEarnedTotal += interestEarned;
            account.deposit(interestEarned);

            count++;
        }
        interestEarnedTotal = Math.round(interestEarnedTotal * 100.0) / 100.0;
        double endingBalance = Math.round(account.getBalance() * 100.0) / 100.0;
        System.out.println("Total deposited: $" + depositedTotal);
        System.out.println("Total withdrawn: $" + withdrawnTotal);
        System.out.println("Interest earned: $" + interestEarnedTotal);
        System.out.println("Ending balance: $" + endingBalance);
    } 
}
