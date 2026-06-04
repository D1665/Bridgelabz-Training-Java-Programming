package review.LibraryManagementSystem;



public class BookBuilder {

    private String title;
    private String author;
    private String edition;

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setEdition(String edition) {
        this.edition = edition;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getEdition() {
        return edition;
    }

    public Book build() {
        return new Book(this);
    }
}