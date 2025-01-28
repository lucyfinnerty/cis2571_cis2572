// Name: Lucy Finnerty
// Date: 10/13/24
// Purpose: This program determines the number of days in a specified month of a given year, 
// taking into account whether the year is a leap year 
import java.util.Scanner;
public class MonthDays {
    // variables to store month and year
    int month;
    int year;

    // constructor to initialize month and year
    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }
    /*
     * method that accepts an int to set to 'month' variable
     */
    public void setMonth(int month) {
        this.month = month;
    }
    /*
     * method that returns 'month' variable
     */
    public int getMonth() {
        return month;
    }
    /*
     * method that accepts an int to set to 'name' variable
     */
    public void setYear(int year) {
        this.year = year;
    }
    /*
     * method that returns 'year' variable
     */
    public int getYear() {
        return year;
    }
    // method to determine the number of days in a given month and year
    public static int numberOfDays(int month, int year) {
        int daysInMonth;
        // determine if it is a leap year
        boolean isLeapYear;
        if (year % 100 == 0) {
            isLeapYear = (year % 400 == 0); // divisible by 400 for leap year if year is divisible by 100
        } else {
            isLeapYear = (year % 4 == 0); // divisible by 4 for leap year otherwise
        }

        // calculate days in given month
        switch (month) {
            case 2: // february
                if (isLeapYear) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4: case 6: case 9: case 11: // april, june, september, november
                daysInMonth = 30;
                break;
            default: // january, march, may, july, august, october, december
                daysInMonth = 31;
                break;
        }
        return daysInMonth;
    }
    public static void main(String[] args) {
        // new scanner object for user input
        Scanner input = new Scanner(System.in);
        while(true){ // loop until user chooses to quit
            // new MonthDays object
            MonthDays object = new MonthDays(0, 0);
            // prompt user for month and year input
            System.out.print("Enter a month (1-12): ");
            object.setMonth(input.nextInt());
            System.out.print("Enter a year (XXXX): ");
            object.setYear(input.nextInt());
            // output the number of days in the entered month and year
            System.out.println(numberOfDays(object.getMonth(), object.getYear()) + " days");
            // ask user if they want to play again
            System.out.println("Play again? (y or n)");
            String playAgain = input.next();
            // if user enters 'n', break the loop and end the program
            if (playAgain.equals("n")) {
                break;
            }
        }
        // display closing statement
        System.out.println("Goodbye!");
    }
}
