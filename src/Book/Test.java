package Book;

public class Test {
    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book("Pride and Prejudice", "Jane Austen", 1813);

        // Call methods
        myBook.displayDetails();
        myBook.readBook();

        Book secondBook = new Book("1984", "George Orwell", 1949);
        secondBook.displayDetails();
        secondBook.readBook();
    }
}
