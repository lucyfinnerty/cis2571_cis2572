// Name: Lucy Finnerty
// Date: 12/8/24
// Purpose: Manages a collection of books, handling file loading, saving, duplicates, and reporting.
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
public class BookManager {
    private Book[] books; // array to store Book instances
    private static final String FILE_NAME = "week16/Books.csv"; // file path where books are stored

    /**
     * constructor initializes the books array and loads data from the file.
     */
    public BookManager() { 
        books = new Book[0]; // start with empty array
        load(); // load books from the file
    }
    /*
     * Read the file book.csv.
     * Read each line, parse the line (delimiter is a comma “,”) and create an instance of the Book class. Add the instance to the book array.
     * If file does not exist, create an empty array and continue
     */
    public void load() {
        books = new Book[0];

        try(Scanner scanner = new Scanner(new File(FILE_NAME))) {
            while(scanner.hasNextLine()) { // loop through each line in the file
                String line = scanner.nextLine();
                String[] parts = line.split(","); // split line into parts using comma as delimiter
                if(parts.length == 4) { // check if the line has all required fields
                    String title = parts[0].trim();
                    String authorFirstName = parts[1].trim();
                    String authorLastName = parts[2].trim();
                    String isbn = parts[3].trim();
                    // create new Book instance and add it to array
                    add(new Book(title, authorFirstName, authorLastName, isbn));
                } else { // print a warning if the line format is invalid
                    System.out.println("Invalid line format: " + line);
                }
            }
        } catch (Exception e) { // if it doesn't exist, initialize an empty array and tell user
            System.out.println("File does not exist. Created an empty book array.");
        }
    }
    /*
     * Loop through array
     * For each entry in the array, use the toString method to get the String to be written to file.
     * Write the entries to file (book.csv)
     * Note: Each entry in the file should be on a new line
     */
    public void save() {
        if (books == null || books.length == 0) { // if there are no books to save
            System.out.println("No books to save."); // display message
            return;
        }
        try(PrintWriter writer = new PrintWriter(FILE_NAME)) {
            for (Book book : books) { // iterate through books
                if (book != null) { // if an entry is NOT null, write its details
                    writer.println(book.toString());
                }
            } // notify user is was successfully saved
            System.out.println("Books saved successfully to " + FILE_NAME);
        } catch (Exception e) { // if it fails to save, display message
            System.out.println("Error: Cannot save book to file.");
        }
    }
    /*
     * Given a book instance, loop through array of book instances.
     * For each instance, use the equals method to check if the book instance is similar to the entry in the array.
     * If similar to any entry, return true, else false
     */
    public boolean isDuplicate(Book book) {
        if (book == null) {
            return false; // no duplicates if the book is null
        }
        for (Book b : books) { // iterate through array
            if (b != null && b.equals(book)) { // use equals method to check for duplicates
                return true; // found a duplicate
            }
        }
        return false; // no duplicate found
    }
    /*
     * Given a book instance, use the isDuplicate method to check if it is a duplicate of an entry
     * in the array. If it is not a duplicate, add it to the array and returns true, else return false.
     */
    public boolean add(Book book) {
        if(isDuplicate(book)) { // check if book is a duplicate
            return false; // do not add
        }
        // resize the array to accommodate the new book
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book; // add the new book at the last position
        return true; // book added successfully
    }
    /*
     * The method runs over the array of book instances and invokes the toString method for each object and adds the returned String to an array.
     * It returns the array of strings
     * This method is used for displaying the report – list of book information – in the GUI
     */
    public String[] getReportList() {
        int count = 0;
        // count number of non-null books
        for (Book book : books) {
            if (book != null) { // if book is NOT null
                count++; // increment count
            }
        }
        String[] reportList = new String[count]; // array for the report
        int index = 0;
        // populate the report list with toString output of each book
        for (Book book : books) {
            if (book != null) { // if book is NOT null
                reportList[index] = book.toString(); // add its details to report list
                index++; // increment index
            }
        }
        return reportList; // return generated report list
    }
}