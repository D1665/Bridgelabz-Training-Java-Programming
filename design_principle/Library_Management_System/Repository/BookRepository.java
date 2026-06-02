package design_principle.Library_Management_System.Repository;



import java.util.List;

import design_principle.Library_Management_System.Model.Book;

public interface BookRepository {

    void addBook(Book book);

    Book findBookById(int id);

    List<Book> getAllBooks();
}
