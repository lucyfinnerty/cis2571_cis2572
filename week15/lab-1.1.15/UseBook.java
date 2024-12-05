// Name: Lucy Finnerty
// Date: 12/5/24
// Purpose: A demonstration class to show how Fiction and NonFiction books can be created.
// it displays the title and price of each book.
public class UseBook {
    public static void main(String[] args) {
        // create fiction and nonfiction book objects
        Book fictionBook = new Fiction("Normal People");
        Book nonFictionBook = new NonFiction("The Immortal Life of Henrietta Lacks");
        // print their titles and prices
        System.out.println("Fiction Book: " + fictionBook.getTitle() + " - $" + fictionBook.getPrice());
        System.out.println("Non-Fiction Book: " + nonFictionBook.getTitle() + " - $" + nonFictionBook.getPrice());
    }
}