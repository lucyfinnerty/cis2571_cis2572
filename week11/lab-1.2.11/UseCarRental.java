
import java.util.Scanner;
public class UseCarRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter renter's name: ");
        String name = input.nextLine();

        System.out.print("Enter zip code: ");
        int zipCode = input.nextInt();

        System.out.print("Enter size of car (ECONOMY, MIDSIZE, FULL_SIZE): ");
        String sizeInput = input.next().toUpperCase();
        CarRental.Size size = CarRental.Size.valueOf(sizeInput);

        System.out.print("Enter number of rental days: ");
        int days = input.nextInt();

        System.out.print("Is this a luxury rental? (yes/no): ");
        boolean isLuxury = input.next().equalsIgnoreCase("yes");

        CarRental rental;

        if (isLuxury) {
            System.out.print("Would you like a chauffeur? (yes/no): ");
            boolean chauffeur = input.next().equalsIgnoreCase("yes");
            rental = new LuxuryCarRental(name, zipCode, size, days, chauffeur);
        } else {
            rental = new CarRental(name, zipCode, size, days);
        }

        System.out.println("\nRental Details:");
        System.out.println(rental.display());
    }
}