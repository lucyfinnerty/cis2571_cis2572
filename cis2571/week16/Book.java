// Name: Lucy Finnerty
// Date: 12/8/24
// Purpose: This class represents a Book object, which has a title, author's first/last name, and an ISBN.
// This class also has accessor and mutator methods, an equals method, and a toString method for when the
// 4 fields can be displayed in the GUI.
public class Book {
    private String title; // title of the book
    private String authorFirstName; // the first name of author of the book
    private String authorLastName; // the last name of author of the book
    private String isbn; // code of the book

    /**
     * constructor that creates Book object
     * @param title title of the book
     * @param authorFirstName the first name of author of the book
     * @param authorLastName the last name of author of the book
     * @param isbn code of the book
     */
    public Book(String title, String authorFirstName, String authorLastName, String isbn) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.isbn = isbn;
    }
    /**
     * accessor method for title field
     * @return title
     */
    public String getTitle() {
        return title;
    }
    /**
     * mutator method for title field
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * accessor method for first name field
     * @return title
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }
    /**
     * mutator method for first name field
     * @param title
     */
    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }
    /**
     * accessor method for last name field
     * @return title
     */
    public String getAuthorLastName() {
        return authorLastName;
    }
    /**
     * mutator method for last name field
     * @param title
     */
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
    /**
     * accessor method for ISBN field
     * @return title
     */
    public String getIsbn() {
        return isbn;
    }
    /**
     * mutator method for IBSN field
     * @param title
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /**
     * Compares the current book instance and returns true if all fields are equal, else
     * false. This method could be used to check for duplicates in the array.
     * @param obj the object to compare with the current book instance
     * @return boolean true if all fields match, false otherwise
     */
    public boolean equals(Object obj) {
        // check if the current instance and the passed object refer to the same memory location
        if(this == obj) { 
            return true;
        }
        // check if the passed object is null or if it is not of the same class as the current instance
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // cast the passed object to a Book instance for field comparison
        Book other = (Book) obj;
        // compare all fields for equality
        return title.equals(other.title) && 
        authorFirstName.equals(other.authorFirstName) && 
        authorLastName.equals(other.authorLastName) && 
        isbn.equals(other.isbn);
    }
    /**
     * Creates a string with Book title, author first name, author last name, ISBN
     */
    @Override
    public String toString() {
        return title + ", " + authorFirstName + ", " + authorLastName + ", " + isbn; // display in GUI
    }
}