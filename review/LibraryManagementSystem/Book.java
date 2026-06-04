package review.LibraryManagementSystem;

public class Book {

    private String title;
    private String author;
    private String edition;

    Book(BookBuilder builder) {
        this.title = builder.getTitle();
        this.author = builder.getAuthor();
        this.edition = builder.getEdition();
    }

    public String getBookTitle() {
        return title;
    }

    public String getBookAuthor() {
        return author;
    }

    public String getBookEdition() {
        return edition;
    }
}
