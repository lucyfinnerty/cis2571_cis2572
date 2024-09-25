// Name: Lucy Finnerty
// Date: 9/23/24
// Purpose: 
import javax.swing.JOptionPane;
public class PayCalculator {
    public static double computePay(int hrs, double rate) {
        double grossPay = 0;
        if (hrs <= 40) {
            grossPay = hrs * rate; // Straight time
        } else {
            grossPay = (40 * rate) + ((hrs - 40) * rate * 1.5); // Time-and-a-half for overtime
        }
        return grossPay;
    }
    public static void displayPay(String fullname, double hoursWorked, double grossPay) {
        JOptionPane.showMessageDialog(null, String.format(
                "Employee: %s\nHours Worked: %.2f\nGross Pay: $%.2f", fullname, hoursWorked, grossPay));
    }
    public static void main(String[] args) {
        int numEmployees = 0;

        // Loop until the user enters a valid number of employees (at least 2)
        while (numEmployees < 2) {
            numEmployees = Integer.parseInt(JOptionPane.showInputDialog("How many employees do you want to input? (At least 2)"));
            if (numEmployees < 2) {
                JOptionPane.showMessageDialog(null, "Please enter a number of 2 or greater.");
            }
        }
        // Loop to process each employee
        int count = 0;
        while (count < numEmployees) {
            String fullname = JOptionPane.showInputDialog("Enter full name of employee " + (count + 1) + ":");
            String ssn = JOptionPane.showInputDialog("Enter SSN of employee " + (count + 1) + ":");
            int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked by " + fullname + ":"));
            double hourlyRate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly rate for " + fullname + ":"));

            // Compute the gross pay
            double grossPay = computePay(hoursWorked, hourlyRate);

            // Display the pay details
            displayPay(fullname, hoursWorked, grossPay);
            count++; // Increment the loop counter
        }
    }
}
