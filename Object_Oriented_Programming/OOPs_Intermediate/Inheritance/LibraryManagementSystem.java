package Object_Oriented_Programming.OOPs_Intermediate.Inheritance;

// Superclass
class Book {
    String title;
    int publicationYear;

    // Constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book info
    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass (inherits Book)
class Author extends Book {
    String name;
    String bio;

    // Constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // calling parent constructor
        this.name = name;
        this.bio = bio;
    }

    // Method to display full info
    void displayInfo() {
        displayBookInfo(); // calling parent method
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Author obj = new Author(
            "Java Programming",
            2022,
            "James Gosling",
            "Father of Java"
        );

        obj.displayInfo();
    }
}