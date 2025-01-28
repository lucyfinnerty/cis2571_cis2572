// Name: Lucy Finnerty
// Date: 9/23/24
// Purpose: This program checks if a user's passwors is valid based on if there are at least 8 character, 
// only contains letters and digits, and there are at least 2 digits.
import java.util.Scanner;
public class CheckPassword {
    // isValidPassword has one parameter, String password, and checks if the given password is valid based on 3 criteria
    public static boolean isValidPassword(String password) {
        // password must have 8 chars
        if (password.length() < 8) {
            return false;
        }
        // digit counter
        int digCount = 0;
        // iterate through each character in password string
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i); // get character at current index
            // check if character is letter or digit
            if (Character.isLetterOrDigit(c)) {
                // if it is a digit, increment digCount
                if (Character.isDigit(c)) {
                    digCount++; // digCount incremented
                }
            } else {
                // if there's any character that's not a letter or digit, return false
                return false;
            }
        }
        // check for at least 2 digits
        return digCount >= 2;
    }
    public static void main(String[] args) {
        // create new scanner object to read user input
        Scanner input = new Scanner(System.in);
        // program terminates once user enters a valid password
        while(true){
            // prompt user to create a new password
            System.out.print("A valid password has 8 or more characters, contains only " 
            + "letters and digits, and at least 2 digits.\nPlease enter a new password: ");
            // String variable 'password' is set to user's input
            String password = input.nextLine();
            // isValidPassword method called and takes in 'password' variable
            // if password meets all requirements...
            if(isValidPassword(password)){
                // display statement letting them know it's valid
                System.out.print("Password is valid!");
                // program terminates
                break;
            } else { // if not valid they must try again
                System.out.println("Try again!");
            }
        }
    }
}
