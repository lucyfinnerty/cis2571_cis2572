import java.util.Scanner;
public class CheckPassword {
    public static boolean isValidPassword(String password) {
        // password must have 8 chars
        if (password.length() < 8) {
            return false;
        }
        // digit counter
        int digCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (Character.isDigit(c)) {
                    digCount++;
                }
            } else {
                // If there's any character that's not a letter or digit, return false
                return false;
            }
        }
        // Check for at least two digits
        return digCount >= 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.print("Please enter a new password: ");
            String password = input.nextLine();

            if(isValidPassword(password)){
                System.out.print("Password is valid!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
