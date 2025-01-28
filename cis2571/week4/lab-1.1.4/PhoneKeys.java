// Name: Lucy Finnerty
// Date: 9/9/24
// Purpose: To prompt user for a letter and display corresponding number from phone key pad
import java.util.Scanner;
public class PhoneKeys {
    public static void main(String[] args) {
        // new scanner object to read user input
        Scanner input = new Scanner(System.in);
        // ask user for a letter
        System.out.print("Enter a letter: ");
        // set user's letter to a new char variable (find char at index 0 and make it lowercase)
        char letter = input.nextLine().toLowerCase().charAt(0);

        // switch statement to map letters to their corresponding number
        switch(letter) {
            // for letters 'a','b', and 'c', corresponding number is 2
            case 'a': case 'b': case 'c':
            // display number to user
                System.out.println("The corresponding number is 2");
                break; // exit switch
            // for letters 'd','e', and 'f', corresponding number is 3
            case 'd': case 'e': case 'f':
                System.out.println("The corresponding number is 3");
                break;
            // for letters 'g','h', and 'i', corresponding number is 4
            case 'g': case 'h': case 'i':
                System.out.println("The corresponding number is 4");
                break;
            // for letters 'j','k', and 'l', corresponding number is 5
            case 'j': case 'k': case 'l':
                System.out.println("The corresponding number is 5");
                break;
            // for letters 'm','n', and 'o', corresponding number is 6
            case 'm': case 'n': case 'o':
                System.out.println("The corresponding number is 6");
                break;
            // for letters 'p','q','r', and 's', corresponding number is 7
            case 'p': case 'q': case 'r': case 's':
                System.out.println("The corresponding number is 7");
                break;
            // for letters 't','u', and 'v', corresponding number is 8
            case 't': case 'u': case 'v':
                System.out.println("The corresponding number is 8");
                break;
            // for letters 'w','x','y', and 'z', corresponding number is 9
            case 'w': case 'x': case 'y': case 'z':
                System.out.println("The corresponding number is 9");
                break;
            // if letter does not match any of the cases, it's invalid
            default:
                System.out.println("Invalid input.");
        }
    }
}