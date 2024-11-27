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
     * get method for title
     */
    public String getTitle() {
        return title;
    }

     /*
      * get method for price
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