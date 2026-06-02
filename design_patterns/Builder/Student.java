package design_patterns.Builder;

class Student {

    String name;
    int age;
    String email;

    Student(StudentBuilder builder) {

        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }
}