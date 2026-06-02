package design_principle.Library_Management_System.Service;

import design_principle.Library_Management_System.Model.Book;
import design_principle.Library_Management_System.Notification.NotificationService;
import design_principle.Library_Management_System.Repository.BookRepository;

public class LibraryService {

    private BookRepository repository;
    private NotificationService notification;

    public LibraryService(
            BookRepository repository,
            NotificationService notification) {

        this.repository = repository;
        this.notification = notification;
    }

    public void addBook(Book book) {

        repository.addBook(book);

        notification.send(
                "Book Added: "
                + book.getTitle()
        );
    }

    public void issueBook(int id) {

        Book book =
                repository.findBookById(id);

        if(book != null &&
                !book.isIssued()) {

            book.setIssued(true);

            notification.send(
                    "Book Issued: "
                    + book.getTitle()
            );
        }
    }

    public void returnBook(int id) {

        Book book =
                repository.findBookById(id);

        if(book != null &&
                book.isIssued()) {

            book.setIssued(false);

            notification.send(
                    "Book Returned: "
                    + book.getTitle()
            );
        }
    }

    public void displayBooks() {

        for(Book book :
                repository.getAllBooks()) {

            System.out.println(book);
        }
    }
}
