// Name: Lucy Finnerty
// Date: 8/24/24
// Purpose: To inform the user how many points they earned based on the amount of books purchased
import java.util.Scanner;
public class BookClubPoints {
    public static void main(String[] args) {
        // new scanner object to read user input
        Scanner input = new Scanner(System.in);
        // display welcome statement and ask for the amount of books purchased
        System.out.print("Welcome to Serendipity Bookseller's Book Club!\nPlease enter the amount of books you purchased this month: ");
        // set books variable to the integer user has provided
        int books = input.nextInt();

        // if user has not purchased any books, they earned no points
        if(books == 0){
            System.out.println("You have 0 points");
        }
        // if user purchased 1 book, they earned 5 points
        else if(books == 1){
            System.out.println("You earned 5 points");
        }
        // if user purchased 2 books, they earned 15 points
        else if(books == 2){
            System.out.println("You earned 15 points");
        }
        // if user purchased 3 books, they earned 30 points
        else if(books == 3){
            System.out.println("You earned 30 points");
        }
        // if user purchased 4 books or more, they earned 60 points
        else if(books >= 4){
            System.out.println("You earned 60 points");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
