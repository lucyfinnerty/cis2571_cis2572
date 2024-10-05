package week7;
import java.util.Scanner;
public class DistFromAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[5];
        int count = 0;
        double sum = 0;
        
        System.out.println("Enter up to 5 double numbers (-9999 to quit):");
        
        while(count < 5) {
            double num = input.nextDouble();

            if (num == -9999 && count == 0) {
                System.out.println("Must input at least one number (maximum is five). Try again:");
                continue; // Ask for input again
            }
            if (num == -9999) {
                break;
            }
            arr[count] = num;
            sum += num;
            count++;
        }
        if (count > 0) {
            double average = sum / count;

            // display each entered value and its distance from the average
            System.out.printf("%-10s %-20s\n", "Value", "Distance from Average");
            for (int i = 0; i < count; i++) {
                double distance = Math.abs(arr[i] - average);
                System.out.printf("%-10.2f %-20.2f\n", arr[i], distance);
            }
        }
    }
}
