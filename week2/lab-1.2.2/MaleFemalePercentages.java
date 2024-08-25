// Name: Lucy Finnerty
// Date: 8/23/24
// Purpose: To calculate and display the percentage of male and female 
//          students given the number of males and females from the user
import java.util.Scanner;
public class MaleFemalePercentages {
    public static void main(String[] args) {
        // new scanner object to read user input
        Scanner input = new Scanner(System.in);
        // ask user for number of males and female students
        System.out.print("Enter the number of male students: ");
        int male = input.nextInt(); // male variable holds user's input
        System.out.print("Enter the number of female students: ");
        int female = input.nextInt(); // femal variable holds user's input

        // calculate total number of students
        int sum = male + female;
        // calculate percentage by dividing num of male or female students by the total
        // then multiply by 100 to convert number from decimal to fraction
        double malePercentage = ((double) male / sum) * 100;
        double femalePercentage = ((double) female / sum) * 100;

        // format and output results to user
        System.out.printf("Male: %.1f%%\n", malePercentage);
        System.out.printf("Female: %.1f%%\n", femalePercentage);
    }
}
