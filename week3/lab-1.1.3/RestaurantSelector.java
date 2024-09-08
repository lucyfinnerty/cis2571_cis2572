// Name: Lucy Finnerty
// Date: 8/24/24
// Purpose: To display restaurants that considers dietary restrictions
import java.util.Scanner;
public class RestaurantSelector {
    public static void main(String[] args) {
        // new scanner object to read user input
        Scanner input = new Scanner(System.in);
        // display opening statement
        System.out.println("This program will help you select a restaurant.");
        
        // ask user if anyone is vegetarian and store answer in vegetarian string variable
        System.out.print("Is anyone in your party a vegetarian? (Enter yes or no): ");
        boolean isVegetarian = input.nextLine().equalsIgnoreCase("yes");
        // ask user if anyone is vegan and store answer in vegan string variable
        System.out.print("Is anyone in your party a vegan? (Enter yes or no): ");
        boolean isVegan = input.nextLine().equalsIgnoreCase("yes");
        // ask user if anyone is gluten-free and store answer in glutenFree string variable
        System.out.print("Is anyone in your party gluten free? (Enter yes or no): ");
        boolean isGlutenFree = input.nextLine().equalsIgnoreCase("yes");

        System.out.println("Here are your restaurant choices:");
        
        boolean found = false; // boolean that helps determine if there are any restaurants that meet criteria

        // condition for "no" on all restrictions
        if (!isVegetarian && !isVegan && !isGlutenFree) {
            // display restaurant that meets criteria
            System.out.println("Joe's Gourmet Burgers");
            // restaurant found
            found = true;
        }
        // condition for gluten-free or vegetarian but not vegan
        if ((isGlutenFree || isVegetarian) && !isVegan) {
            // display restaurant that meets criteria
            System.out.println("Main Street Pizza Company");
            // restaurant found
            found = true;
        }
        // condition for "yes" on all dietary restrictions
        if (isVegetarian || isVegan || isGlutenFree) {
            // display restaurants that meets criteria
            System.out.println("Corner Cafe");
            System.out.println("The Chef's Kitchen");
            // restaurant found
            found = true;
        }
        // condition for vegetarian, but not vegan or gluten-free
        if (isVegetarian && !isVegan && !isGlutenFree) {
            // display restaurant that meets criteria
            System.out.println("Mama's Fine Italian");
            // restaurant found
            found = true;
        }
        // when user's input does not match any of the above conditions, then no restaurants found
        if (!found) {
            // display closing statement
            System.out.println("No restaurants meet your criteria or input invalid.");
        }
    }
}