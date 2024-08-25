
// Name: Lucy Finnerty
// Date: 8/24/24
// Purpose: 
import java.util.Scanner;
public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program will help you select a restaurant.");
        System.out.print("Is anyone in your party a vegetarian? (Enter yes or no): ");
        String vegetarian = input.nextLine();
        System.out.print("Is anyone in your party a vegan? (Enter yes or no): ");
        String vegan = input.nextLine();
        System.out.print("Is anyone in your party gluten free? (Enter yes or no): ");
        String glutenFree = input.nextLine();
        
        // check and output all the restaurants that meet the criteria
        if (vegetarian.equals("no") && vegan.equals("no") && glutenFree.equals("no")) {
            System.out.println("Joe's Gourmet Burgers");
        }
        if (vegetarian.equals("yes") && vegan.equals("no") && glutenFree.equals("yes")) {
            System.out.println("Main Street Pizza Company");
        }
        if (vegetarian.equals("yes") && vegan.equals("yes") && glutenFree.equals("yes")) {
            System.out.println("Corner Cafe");
            System.out.println("The Chef's Kitchen");
        }
        if (vegetarian.equals("yes") && vegan.equals("no") && glutenFree.equals("no")) {
            System.out.println("Mama's Fine Italian");
        }
        if (vegetarian.equals("yes")) {
            if (vegan.equals("no") && glutenFree.equals("yes")) {
                System.out.println("Corner Cafe");
                System.out.println("The Chef's Kitchen");
            }
        }
    }
}
