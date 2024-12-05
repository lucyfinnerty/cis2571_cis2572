// Name: Lucy Finnerty
// Date: 12/5/24
// Purpose: This is an abstract class representing a Book. It contains two fields, a title and a price.
// It also provides accessor methods for title/price and an abstract method to set the price that must be
// implements by subclasses.
public abstract class Book {
    private String title; // title of book
    protected double price; // price of book

    /** 
     * constructor sets the book's title and price.
     * @param title title of the book
    */
    public Book(String title) {
        this.title = title;
    }

    /*
     * accessor method for title field
     */
    public String getTitle() {
        return title;
    }

     /*
      * accessor method for price field
      */
    public double getPrice() {
        return price;
    }

    /*
    * abstract method for setting price
    * must be overridden in subclasses (fiction/non-fiction)
    */
    public abstract void setPrice();
}