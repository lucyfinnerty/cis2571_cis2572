public class UseBook {
    public static void main(String[] args) {
        Book fictionBook = new Fiction("Normal People");
        Book nonFictionBook = new NonFiction("The Immortal Life of Henrietta Lacks");

        System.out.println("Fiction Book: " + fictionBook.getTitle() + " - $" + fictionBook.getPrice());
        System.out.println("Non-Fiction Book: " + nonFictionBook.getTitle() + " - $" + nonFictionBook.getPrice());
    }
}
