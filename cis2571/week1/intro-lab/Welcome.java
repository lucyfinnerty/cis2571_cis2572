// Name: Lucy Finnerty
// Date: 8/22/24
// Purpose: The program will display the area and volume of the cylinder.
import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.println("Enter length of the cylinder: ");
        double length = input.nextDouble();

        double area = radius * radius * 3.14159;
        double volume = area * length;

        System.out.println("The area is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);
    }
}