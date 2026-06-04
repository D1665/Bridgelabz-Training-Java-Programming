package review.LibraryManagementSystem;

public class UserFactory {
    public static User CreateUser(String type){
        switch (type) {
            case "student":
                return (User) new Student();

            case "faculty":
                return new Faculty();
            case "librarian":
                return new Librarian();
        
            default:
                throw new IllegalArgumentException("Unknown type");
        }

    }
}
