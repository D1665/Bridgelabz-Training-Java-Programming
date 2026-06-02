package design_principle.Library_Management_System.Repository;



import java.util.ArrayList;
import java.util.List;

import design_principle.Library_Management_System.Model.Book;

public class InMemoryBookRepository
        implements BookRepository {

    private List<Book> books =
            new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Book findBookById(int id) {

        for(Book book : books) {

            if(book.getId() == id) {
                return book;
            }
        }

        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}
