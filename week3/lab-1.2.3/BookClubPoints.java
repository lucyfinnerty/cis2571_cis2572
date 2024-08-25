// Name: Lucy Finnerty
// Date: 8/24/24
// Purpose:
import java.util.Scanner;
public class BookClubPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Serendipity Bookseller's Book Club!\nPlease enter the amount of books you purchased this month: ");
        int books = input.nextInt();

        if(books == 0){
            System.out.println("You have 0 points");
        }
        if(books == 1){
            System.out.println("You earned 5 points");
        }
        if(books == 2){
            System.out.println("You earned 15 points");
        }
        if(books == 3){
            System.out.println("You earned 30 points");
        }
        if(books >= 4){
            System.out.println("You earned 60 points");
        }
    }
}
