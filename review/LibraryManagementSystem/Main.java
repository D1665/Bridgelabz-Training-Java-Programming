package review.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        User student=UserFactory.CreateUser("student");
        User faculty=UserFactory.CreateUser("faculty");
        User librarian=UserFactory.CreateUser("librarian");
        student.showRole();
        faculty.showRole();
        librarian.showRole();
        Library lb1=Library.getInstance();
        Library lb2=Library.getInstance();
        System.out.println(lb1==lb2);

        Book book = new BookBuilder()
        .setTitle("Clean Code")
        .setAuthor("Robert C. Martin")
        .setEdition("1st Edition")
        .build();

System.out.println("Title: " + book.getBookTitle());
System.out.println("Author: " + book.getBookAuthor());
System.out.println("Edition: " + book.getBookEdition());


    }
}
