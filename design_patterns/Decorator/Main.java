package design_patterns.Decorator;

public class Main {

    public static void main(String[] args) {

        Book book =
                new DownloadableBook(
                    new AudioBook(
                        new PremiumBook(
                            new BasicBook()
                        )
                    )
                );

        System.out.println(
                "Description : "
                + book.getDescription());

        System.out.println(
                "Price : ₹"
                + book.getPrice());
    }
}