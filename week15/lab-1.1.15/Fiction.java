// Name: Lucy Finnerty
// Date: 12/5/24
// Purpose: This class is a subclass of Book representing a Fiction book. It Overrides 
// the `setPrice()` method to assign a fixed price of $24.99.
public class Fiction extends Book {
    /**
     * constructor to initialize the title and set the price of the book
     * @param title The title of the Fiction book
     */
    public Fiction(String title) {
        super(title); // call the constructor of the superclass (Book)
        setPrice(); // set the price for Fiction books
    }
    /**
     * sets the price of Fiction books to $24.99
     */
    @Override
    public void setPrice() {
        price = 24.99;
    }
}