package design_patterns.Decorator;

class AudioBook
        extends BookDecorator {

    public AudioBook(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {

        return book.getDescription()
                + " + Audio Version";
    }

    @Override
    public int getPrice() {

        return book.getPrice() + 30;
    }
}
