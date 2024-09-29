// Name: Lucy Finnerty
// Date: 9/23/24
// Purpose: This program uses dialog boxes to display calculated the gross pay for each of several employees
import javax.swing.JOptionPane;
public class PayCalculator {
    /* 
    computePay has two parameters--int hrs (amount of hours worked by employee) and double rate (amount 
    earned each hour) 
    
    computePay will calculate the gross pay and returns the amount computed
    */
    public static double computePay(int hrs, double rate) {
        double grossPay = 0;
        // if hrs is less than or equal to 40, then they are counted as straight time
        if (hrs <= 40) {
            grossPay = hrs * rate; 
        } else { // any hours worked after the original 40, employee will be paid for time-and-a-half
            grossPay = (40 * rate) + ((hrs - 40) * rate * 1.5);
        }
        // return total amount of money earned by employee
        return grossPay;
    }
    /* 
    displayPay has three parameters--String fullname (name of employee), double hoursWorked (amount of 
    hours worked by said employee), and double grossPay (amount of money earned before taxes/deductions)

    displayPay displays the result of the calculation
    */
    public static void displayPay(String fullname, double hoursWorked, double grossPay) {
        // box output with employee information will be displayed
        JOptionPane.showMessageDialog(null, String.format(
                "Employee: %s\nHours Worked: %.2f\nGross Pay: $%.2f", fullname, hoursWorked, grossPay));
    }
    public static void main(String[] args) {
        // set int variable 'numEmployees' to 0
        int numEmployees = 0;
        // loop until the user enters a valid number of employees (at least 2)
        while (numEmployees < 2) {
            // set users input to numEmployees
            numEmployees = Integer.parseInt(JOptionPane.showInputDialog("How many employees do you want to input? (At least 2)"));
            // if they enter any number less than 2, error message will display
            if (numEmployees < 2) {
                // direct user to enter a number more than 2
                JOptionPane.showMessageDialog(null, "Please enter a number of 2 or greater.");
            }
        }
        // loop to process each employee
        int count = 0;
        // only ask information for the amount of employees user wants to input
        while (count < numEmployees) {
            // ask for each employees name, ssn, hours, and rate
            String fullname = JOptionPane.showInputDialog("Enter full name of employee " + (count + 1) + ":");
            String ssn = JOptionPane.showInputDialog("Enter SSN of employee " + (count + 1) + ":");
            int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked by " + fullname + ":"));
            double hourlyRate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly rate for " + fullname + ":"));

            // calculate the gross pay
            double grossPay = computePay(hoursWorked, hourlyRate);

            // display the pay details
            displayPay(fullname, hoursWorked, grossPay);
            count++; // increment the loop counter
        }
    }
}
