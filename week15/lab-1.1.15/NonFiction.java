// Name: Lucy Finnerty
// Date: 12/5/24
// Purpose: This class is a subclass of Book representing a NonFiction book. It Overrides 
// the `setPrice()` method to assign a fixed price of $37.99.
public class NonFiction extends Book {
    /**
     * constructor to initialize the title and set the price of the book
     * @param title The title of the Non-Fiction book
     */
    public NonFiction(String title) {
        super(title); // call the constructor of the superclass (Book)
        setPrice(); // set the price for Non-Fiction books
    }
    /**
     * sets the price of Non-Fiction books to $37.99
     */
    @Override
    public void setPrice() {
        price = 37.99;
    }
}