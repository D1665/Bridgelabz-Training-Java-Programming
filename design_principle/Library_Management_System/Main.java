package design_principle.Library_Management_System;

import design_principle.Library_Management_System.Model.Book;
import design_principle.Library_Management_System.Notification.EmailNotificationService;
import design_principle.Library_Management_System.Notification.NotificationService;
import design_principle.Library_Management_System.Repository.BookRepository;
import design_principle.Library_Management_System.Repository.InMemoryBookRepository;
import design_principle.Library_Management_System.Service.LibraryService;

public class Main {

    public static void main(String[] args) {

        BookRepository repository =
                new InMemoryBookRepository();

        NotificationService notification =
                new EmailNotificationService();

        LibraryService library =
                new LibraryService(
                        repository,
                        notification
                );

        library.addBook(
                new Book(1,
                        "Java Programming"));

        library.addBook(
                new Book(2,
                        "Spring Boot"));

        library.issueBook(1);

        library.returnBook(1);

        library.displayBooks();
    }
}
