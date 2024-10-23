import java.util.Scanner;
public class GeometryDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Geometry demo = new Geometry();
        boolean continueDemo = true;
        
        while(continueDemo) {
            System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate the area of a circle\n" +
        "2. Calculate the area of a triangle\n" +
        "3. Calculate the area of a rectangle\n" +
        "4. Quit\n");
        System.out.print("Enter your choice (1-4): ");
        int option = input.nextInt();

        switch (option) {
            case 1: // area of circle
                System.out.println("Enter radius of circle: ");
                double radius = input.nextDouble();
                while(radius<0) {
                    System.out.println("Must enter a postive integer!");
                    radius = input.nextDouble();
                }
                System.out.println("The circle's area is "+demo.circleArea(radius)+"\n");
                break;
            case 2: // area of triangle
                System.out.println("Enter length of triangle base: ");
                double base = input.nextDouble();
                // base input validation
                while(base<0) {
                    System.out.println("Must enter a postive integer!");
                    base = input.nextDouble();
                }
                System.out.println("Enter height of triangle: ");
                double height = input.nextDouble();
                // height input validation
                while(height<0) {
                    System.out.println("Must enter a postive integer!");
                    height = input.nextDouble();
                }
                System.out.println("The triangle's area is "+demo.triangleArea(base, height)+"\n");
                break;
            case 3: // area of rectangle
                System.out.println("Enter length of rectangle: ");
                double length = input.nextDouble();
                // length input validation
                while(length<0) {
                    System.out.println("Must enter a postive integer!");
                    length = input.nextDouble();
                }
                System.out.println("Enter width of rectangle: ");
                double width = input.nextDouble();
                // width input validation
                while(width<0) {
                    System.out.println("Must enter a postive integer!");
                    width = input.nextDouble();
                }
                System.out.println("the rectangle's area is "+demo.rectangleArea(length, width)+"\n");
                break;
            case 4:
                System.out.println("Goodbye!");
                continueDemo = false;
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
        }
    }
}