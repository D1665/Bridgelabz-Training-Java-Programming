package design_patterns.Decorator;

class DownloadableBook
        extends BookDecorator {

    public DownloadableBook(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {

        return book.getDescription()
                + " + Download Feature";
    }

    @Override
    public int getPrice() {

        return book.getPrice() + 20;
    }
}