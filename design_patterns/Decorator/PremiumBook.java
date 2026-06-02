package design_patterns.Decorator;

class PremiumBook
        extends BookDecorator {

    public PremiumBook(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {

        return book.getDescription()
                + " + Premium Access";
    }

    @Override
    public int getPrice() {

        return book.getPrice() + 50;
    }
}
