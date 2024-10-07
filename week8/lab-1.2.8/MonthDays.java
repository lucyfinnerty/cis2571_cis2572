import java.util.Scanner;
public class MonthDays {
    
    int month;
    int year;

    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public static int numberOfDays(int month, int year) {
        int daysInMonth;
        // determine if it is a leap year
        boolean isLeapYear;
        if (year % 100 == 0) {
            isLeapYear = (year % 400 == 0);
        } else {
            isLeapYear = (year % 4 == 0);
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
        Scanner input = new Scanner(System.in);
        while(true){
            MonthDays object = new MonthDays(0, 0);
            System.out.print("Enter a month (1-12): ");
            object.setMonth(input.nextInt());
            System.out.print("Enter a year (XXXX): ");
            object.setYear(input.nextInt());
            System.out.println(numberOfDays(object.getMonth(), object.getYear()) + " days");
            
            System.out.println("Play again? (y or n)");
            String playAgain = input.next();
            if (playAgain.equals("n")) {
                break;
            }
        }
        System.out.println("Goodbye!");
    }
}
