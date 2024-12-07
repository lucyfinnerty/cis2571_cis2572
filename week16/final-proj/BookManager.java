import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
public class BookManager {
    private BookFP[] books;
    private static final String FILE_NAME = "week16/final-proj/Books.csv";

    public BookManager() {
        //this.books = books; 
        books = new BookFP[100];
        load();
    }
    /*
     * Read the file book.csv.
     * Read each line, parse the line (delimiter is a comma “,”) and create an instance of the Book class. Add the instance to the book array.
     * If file does not exist, create an empty array and continue
     */
    public void load() {
        books = new BookFP[100];
        int count = 0;

        try(Scanner scanner = new Scanner(new File(FILE_NAME))) {
            while(scanner.hasNextLine() && count < 100) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if(parts.length == 4) {
                    String title = parts[0].trim();
                    String authorFirstName = parts[1].trim();
                    String authorLastName = parts[2].trim();
                    String isbn = parts[3].trim();
                    // create new Book instance and add it to array
                    books[count] = new BookFP(title, authorFirstName, authorLastName, isbn);
                    count++;
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }
        } catch (Exception e) {
            System.out.println("File does not exist. Created an empty book array.");
        }
        BookFP[] resizedBooks = new BookFP[count];
        System.arraycopy(books, 0, resizedBooks, 0, count);
        books = resizedBooks;
    }
    /*
     * Loop through array
     * For each entry in the array, use the toString method to get the String to be written to file.
     * Write the entries to file (book.csv)
     * Note: Each entry in the file should be on a new line
     */
    public void save() {
        if (books == null || books.length == 0) {
            System.out.println("No books to save.");
            return;
        }
        try(PrintWriter writer = new PrintWriter(FILE_NAME)) {
            for(int i=0; i < books.length; i++) {
                if(books[i] != null) {
                    writer.println(books[i].toString());
                }
            }
            System.out.println("Books saved successfully to " + FILE_NAME);
        } catch (Exception e) {
            System.out.println("Error: Cannot save book to file.");
        }   
    }
    /*
     * Given a book instance, loop through array of book instances.
     * For each instance, use the equals method to check if the book instance is similar to the entry in the array.
     * If similar to any entry, return true, else false
     */
    public boolean isDuplicate(BookFP book) {
        if (book == null) {
            return false; // no duplicates if the array or book is null
        }
        for(int i=0; i < books.length; i++) {
            if(books[i] != null && books[i].equals(book)) {
                return true; // found a duplicate
            }
        }
        return false; // no duplicate found
    }
    /*
     * Given a book instance, use the isDuplicate method to check if it is a duplicate of an entry
     * in the array. If it is not a duplicate, add it to the array and returns true, else return false.
     */
    public boolean add(BookFP book) {
        if(isDuplicate(book)) { // true, is a duplicate
            return false;
        }
        // check for a free slot
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book; // Add the new book
                return true;
            }
        }
        // If no space is available, resize the array and add the book
        books = Arrays.copyOf(books, books.length + 10); // Increase the size by 10
        books[books.length - 10] = book; // Add the new book in the last available spot
        return true;
    }
    /*
     * The method runs over the array of book instances and invokes the toString method for each object and adds the returned String to an array.
     * It returns the array of strings
     * This method is used for displaying the report – list of book information – in the GUI
     */
    public String[] getReportList() {
        // First, count how many non-null books are in the array
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                count++;
            }
        }
        // create a new String array of the appropriate size
        String[] reportList = new String[count];

        // fill the array with the toString representation of each book
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                reportList[index] = books[i].toString();
                index++;
            }
        }
        return reportList;
    }
}