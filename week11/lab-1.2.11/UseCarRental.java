// Name: Lucy Finnerty
// Date: 10/29/24
// Purpose: This class is an application to determine all of the renter's info.
import java.util.Scanner;
public class UseCarRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // new scanner object to read user input
        // prompt user for their name and set it to a variable
        System.out.print("Enter renter's name: ");
        String name = input.nextLine();
        
        // prompt user for their zip code and set it to a variable
        System.out.print("Enter zip code: ");
        int zipCode = input.nextInt();
        
        // prompt user for their desired size of a car
        System.out.print("Enter size of car (ECONOMY, MIDSIZE, FULL_SIZE): ");
        String sizeInput = input.next().toUpperCase(); // set it to variable and make sure input is upper case to match enum
        CarRental.Size size = CarRental.Size.valueOf(sizeInput); // set enum variable
        
        // prompt user for amount of days they will rent and set it to a variable
        System.out.print("Enter number of rental days: ");
        int days = input.nextInt();

        // prompt user to enter whether or not their rental is luxury and set it to a variable
        System.out.print("Is this a luxury rental? (yes/no): ");
        boolean isLuxury = input.next().equalsIgnoreCase("yes");
        
        // new CarRental object
        CarRental rental;
        if (isLuxury) { // if true, ask if they want a chauffeur and make rental a LuxuryCarRental
            System.out.print("Would you like a chauffeur? (yes/no): ");
            boolean chauffeur = input.next().equalsIgnoreCase("yes");
            rental = new LuxuryCarRental(name, zipCode, size, days, chauffeur);
        } else { // if isLuxury is false, make rental a CarRental
            rental = new CarRental(name, zipCode, size, days);
        } 
        // display rental info
        System.out.println("\nRental Details:");
        System.out.println(rental.display());
    }
}