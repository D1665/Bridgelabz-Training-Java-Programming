package design_patterns.Factory_method;

public class Client {
  public static void main(String[] args) {
    UserCreator creator =
        new StudentCreator();

User user =
        creator.createUser();

user.role();
  }
}
