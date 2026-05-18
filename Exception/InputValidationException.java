package Exception;

public class InputValidationException extends RuntimeException {

    private String field;

    public InputValidationException(String field, String message) {
        super("Validation Error [" + field + "]: " + message);
        this.field = field;
    }

    public String getField() { return field; }
}

class UserValidator {

    static void validateAge(int age) {
        if (age < 0 || age > 150)
            throw new InputValidationException("Age", "Must be between 0 and 150, got: " + age);
    }

    static void validateName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new InputValidationException("Name", "Cannot be null or empty.");
        if (name.length() < 2)
            throw new InputValidationException("Name", "Must be at least 2 characters long.");
    }

    static void validateEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains("."))
            throw new InputValidationException("Email", "Invalid email format: " + email);
    }

    static void registerUser(String name, int age, String email) {
        validateName(name);
        validateAge(age);
        validateEmail(email);
        System.out.println("User registered: " + name + ", Age: " + age + ", Email: " + email);
    }
}

class MainInputValidation {
    public static void main(String[] args) {
        // Valid input
        try {
            UserValidator.registerUser("Alice", 25, "alice@example.com");
        } catch (InputValidationException e) {
            System.out.println(e.getMessage());
        }

        // Invalid age
        try {
            UserValidator.registerUser("Bob", -5, "bob@example.com");
        } catch (InputValidationException e) {
            System.out.println(e.getMessage());
        }

        // Invalid name
        try {
            UserValidator.registerUser("", 30, "charlie@example.com");
        } catch (InputValidationException e) {
            System.out.println(e.getMessage());
        }

        // Invalid email
        try {
            UserValidator.registerUser("Diana", 28, "notanemail");
        } catch (InputValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}