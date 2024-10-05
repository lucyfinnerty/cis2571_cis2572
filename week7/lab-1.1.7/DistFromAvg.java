
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
                continue; // ask for input again
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

            System.out.print("Value        ");
            System.out.println("Distance from Average");
            // display each entered value and its distance from the average
            for (int i = 0; i < count; i++) {
                double distance = Math.abs(arr[i] - average);
                System.out.print(arr[i]);
                System.out.print("          "); // add spaces for alignment
                System.out.println(distance);
            }
        }
    }
}
