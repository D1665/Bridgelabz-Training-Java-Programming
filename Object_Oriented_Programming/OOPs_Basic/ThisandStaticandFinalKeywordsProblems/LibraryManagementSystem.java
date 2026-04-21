package Object_Oriented_Programming.OOPs_Basic.ThisandStaticandFinalKeywordsProblems;
class Book {

    // 1. Static variable
    static String libraryName = "National Library";

    // Instance variables
    String title;
    String author;

    // 3. Final variable
    final String isbn;

    // Constructor using "this"
    Book(String title, String author, String isbn) {
        this.title = title;     // 2. this keyword
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("----------------------");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        // Creating objects
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN001");
        Book b2 = new Book("OOP Concepts", "Bjarne Stroustrup", "ISBN002");

        // Static method call
        Book.displayLibraryName();

        // Display books
        b1.displayBook();
        b2.displayBook();

        // 4. instanceof check
        if (b1 instanceof Book) {
            System.out.println("b1 is an instance of Book class");
        }

        if (b2 instanceof Book) {
            System.out.println("b2 is an instance of Book class");
        }
    }
}