public class BookFP {
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private String isbn;

    /**
     * constructor
     * @param title
     * @param authorFirstName
     * @param authorLastName
     * @param isbn
     */
    public BookFP(String title, String authorFirstName, String authorLastName, String isbn) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthorFirstName() {
        return authorFirstName;
    }
    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }
    public String getAuthorLastName() {
        return authorLastName;
    }
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /**
     * compares the current book instance and returns true if all fields are equal, else
     * false. This method could be used to check for duplicates in the array.
     * @param obj
     * @return boolean
     */
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BookFP other = (BookFP) obj;
        return title.equals(other.title) && 
        authorFirstName.equals(other.authorFirstName) && 
        authorLastName.equals(other.authorLastName) && 
        isbn.equals(other.isbn);
    }
    /**
     * Book-title, Author First Name, Author Last Name, ISBN
     */
    @Override
    public String toString() {
        return title + ", " + authorFirstName + ", " + authorLastName + ", " + isbn;
    }
}