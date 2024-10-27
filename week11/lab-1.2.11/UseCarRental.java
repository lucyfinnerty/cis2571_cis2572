
import java.util.Scanner;
public class UseCarRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Rental Car Facility\n"
        +"======================" +
        "Basic or luxury: ");
        String type = input.nextLine().toLowerCase();
        switch(type) {
            case "basic":
                CarRental rental = new CarRental(null, 0, null, 0);
                break;
            case "luxury":
                //LuxuryCarRental rental = new LuxuryCarRental(null, 0, null, 0, false);
                break;
            default:
                System.out.println("Please enter 'basic' or 'luxury' ");
        }
    }   
}
