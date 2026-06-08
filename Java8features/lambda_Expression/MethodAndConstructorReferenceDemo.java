package Java8features.lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodAndConstructorReferenceDemo {

    // Custom class for Constructor Reference example
    static class Student {

        Student() {
            System.out.println("Student Object Created");
        }

        public void display() {
            System.out.println("Inside Student Class");
        }
    }

    public static void main(String[] args) {

        // =====================================================
        // METHOD REFERENCE EXAMPLE
        // =====================================================

        System.out.println("=== Method Reference Example ===");

        List<String> languages =
                Arrays.asList("Java", "Python", "C++");

        // Lambda Expression
        System.out.println("Using Lambda:");
        languages.forEach(
                language -> System.out.println(language)
        );

        // Method Reference
        // Instead of:
        // language -> System.out.println(language)
        // we can write:
        System.out.println("\nUsing Method Reference:");
        languages.forEach(System.out::println);



        // =====================================================
        // CONSTRUCTOR REFERENCE EXAMPLE
        // =====================================================

        System.out.println("\n=== Constructor Reference Example ===");

        // Lambda Expression
        Supplier<Student> student1 =
                () -> new Student();

        System.out.println("Creating object using Lambda:");
        Student s1 = student1.get();
        s1.display();

        // Constructor Reference
        // Instead of:
        // () -> new Student()
        // we can write:
        Supplier<Student> student2 =
                Student::new;

        System.out.println("\nCreating object using Constructor Reference:");
        Student s2 = student2.get();
        s2.display();
    }
}