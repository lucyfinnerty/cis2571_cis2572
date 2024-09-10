// Name: Lucy Finnerty
// Date: 9/9/24
// Purpose: To give a user their payroll statement, which displays their net pay after deductions
import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        // new scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // prompt user to enter a name
        System.out.print("Enter employee's name: ");
        // set their input to string variable 'name'
        String name = input.nextLine();
        
        // prompt user to enter number of hours worked
        System.out.print("Enter number of hours worked in a week: ");
        // set their input to double variable 'hours'
        double hours = input.nextDouble();
        
        // prompt user for their pay rate
        System.out.print("Enter hourly pay rate: ");
        // set their input to double variable 'pay'
        double pay = input.nextDouble();
        
        // prompt user for federal tax withholding rate
        System.out.print("Enter federal tax withholding rate: ");
        // set their input to double variable 'fedRate'
        double fedRate = input.nextDouble();
        
        // prompt user for their state tax withholding rate
        System.out.print("Enter state tax withholding rate: ");
        // set their input to double variable 'stateRate'
        double stateRate = input.nextDouble();

        // amount of money earned before deductions
        double grossPay = pay * hours;
        // taxes - money deducted from grosspay
        double fedDeduction = grossPay * fedRate;
        double stateDeduction = grossPay * stateRate;
        // federal and state deductions
        double totalDeduction = fedDeduction + stateDeduction;
        // amount of money employee receives after deductions
        double netPay = grossPay - totalDeduction;

        // display payroll statement to user
        System.out.println("\nEmployee Name: " + name);
        System.out.printf("Hours Worked: %.1f\n", hours);
        System.out.printf("Pay Rate: $%.2f\n", pay);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("   Federal Withholding (%.1f%%): $%.2f\n", fedRate * 100, fedDeduction);
        System.out.printf("   State Withholding (%.1f%%): $%.2f\n", stateRate * 100, stateDeduction);
        System.out.printf("   Total Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f\n", netPay);
    }
}