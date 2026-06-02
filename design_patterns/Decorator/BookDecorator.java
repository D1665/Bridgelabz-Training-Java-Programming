package design_patterns.Decorator;

abstract class BookDecorator
        implements Book {

    protected Book book;

    public BookDecorator(Book book) {
        this.book = book;
    }
}
