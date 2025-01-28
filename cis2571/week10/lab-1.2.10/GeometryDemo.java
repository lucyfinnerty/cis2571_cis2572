// Name: lucy Finnerty
// Date: 10/24/24
// Purpose: This program 
import java.util.Scanner;
public class GeometryDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // new scanner object to read user input
        Geometry demo = new Geometry(); // new geometry object to utilize calculation methods
        boolean continueDemo = true; // false when user wants to exit program
        
        while(continueDemo) { // while user wants to use program (continueDemo=true)
            // display menu to user
            System.out.println("Geometry Calculator\n");
            System.out.println("1. Calculate the area of a circle\n" +
            "2. Calculate the area of a triangle\n" +
            "3. Calculate the area of a rectangle\n" +
            "4. Quit\n");
            System.out.print("Enter your choice (1-4): "); // prompt user to enter an option (1-4)
            int option = input.nextInt(); // option variable set to the number user entered

            switch (option) { // option enters switch statement to determine the next prompts for user
                // option 1
                case 1: // area of circle
                    System.out.print("Enter radius of circle: "); // prompt user to enter radius of their circle
                    double radius = input.nextDouble(); // user's radius is set to a variable for input validation
                    while(radius<0) { // while radius is negative, prompt user to enter a positive integer
                        System.out.println("Must enter a postive integer!");
                        radius = input.nextDouble();
                    } // round and display area
                    System.out.printf("Area of the circle: %.2f\n", demo.circleArea(radius));
                    break; // break out of switch statement, menu is displayed again
                
                // option 2
                case 2: // area of triangle
                    System.out.print("Enter length of triangle base: "); // prompt user to enter base length of their triangle
                    double base = input.nextDouble(); // user's base is set to a variable for input validation
                    while(base<0) { // while base is negative, prompt user to enter a positive integer
                        System.out.println("Must enter a postive integer!");
                        base = input.nextDouble();
                    }
                    System.out.print("Enter height of triangle: "); // prompt user to enter height of their triangle
                    double height = input.nextDouble(); // user's height is set to a variable for input validation
                    while(height<0) { // while height is negative, prompt user to enter a positive integer
                        System.out.println("Must enter a postive integer!");
                        height = input.nextDouble();
                    } // round and display area
                    System.out.printf("Area of the triangle: %.2f\n", demo.triangleArea(base, height));
                    break; // break out of switch statement, menu is displayed again
                
                // option 3
                case 3: // area of rectangle
                    System.out.print("Enter length of rectangle: "); // prompt user to enter length of their rectangle
                    double length = input.nextDouble(); // user's length is set to a variable for input validation
                    // length input validation
                    while(length<0) { // while length is negative, prompt user to enter a positive integer
                        System.out.println("Must enter a postive integer!");
                        length = input.nextDouble();
                    }
                    System.out.print("Enter width of rectangle: "); // prompt user to enter width of their rectangle
                    double width = input.nextDouble(); // user's width is set to a variable for input validation
                    // width input validation
                    while(width<0) { // while width is negative, prompt user to enter a positive integer
                        System.out.println("Must enter a postive integer!");
                        width = input.nextDouble();
                    } // round and display area
                    System.out.printf("Area of the rectangle: %.2f\n", demo.rectangleArea(length, width));
                    break; // break out of switch statement, menu is displayed again
                
                // option 4
                case 4: // exit application
                    System.out.println("Goodbye!"); // display closing statement to user
                    continueDemo = false; // user does not want to continue the program
                    break; // program terminates
                default: // when user does not enter a valid option choice
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}