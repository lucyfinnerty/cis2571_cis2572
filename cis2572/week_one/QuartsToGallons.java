import java.util.Scanner;

public class QuartsToGallons {

    public static void main(String[] args) {
        final int NUMBER_OF_QUARTS = 4;
        int paintingJobQuarts = 0;
        boolean validInput = false; // to track when input is valid
        @SuppressWarnings("resource")
        Scanner inputDevice = new Scanner(System.in);

        while(!validInput) { // loop until input is valid
            try {
                System.out.println("How many quarts of paint do you need for the painting job?");
                paintingJobQuarts = inputDevice.nextInt();
                validInput = true; // input is valid, exit loop
            } catch(Exception e) {
                System.out.println("Error: Invalid input. Please try again!"); // ask user to try again
                inputDevice.next(); // clear invalid input
            }
        }
        int gallons = paintingJobQuarts / NUMBER_OF_QUARTS;
        int quarts = paintingJobQuarts % NUMBER_OF_QUARTS;

        System.out.println("A painting job that needs to use " + paintingJobQuarts + " quarts requires "
                + gallons + " gallons and " + quarts + " quarts of paint.");
    }
}