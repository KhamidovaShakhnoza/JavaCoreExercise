package Book;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void displayDetails() {
        System.out.println("Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}');
    }
    public void readBook() {
        System.out.println("You are now reading "+title);
    }
    public void recommendBook() {
        System.out.println("I recommend reading \"" + title + "\" by " + author + ".");
    }
}
