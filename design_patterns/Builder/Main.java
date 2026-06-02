package design_patterns.Builder;

public class Main {
    public static void main(String[] args) {
        Student student =
    new StudentBuilder()
        .setName("Dinesh")
        .setAge(22)
        .setEmail("dinesh@gmail.com")
        .build();
        
    }
}
