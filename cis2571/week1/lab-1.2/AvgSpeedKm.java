// Name: Lucy Finnerty
// Date: 8/22/24
// Purpose: To convert to and calculate kilometers per hour using input from a user.
import java.util.Scanner;
public class AvgSpeedKm {
    public static void main(String[] args) {
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // ask user for number of miles traveled
        System.out.println("Enter miles traveled: ");
        // set miles variable to user's input
        double miles = input.nextDouble();
        // ask user for amount of time spent traveling said distance
        System.out.println("Enter amount of time spent (minutes): ");
        // set time variable to user's input
        double time = input.nextDouble();

        // convert minutes to hours
        double hours = time / 60.0;
        // calculate miles per hour
        double mph = miles / hours;
        // convert mph to kmh
        double kph = mph * 1.6;
        // output result to user
        System.out.println("Your average speed in kilometers is: " + kph);
    }
}