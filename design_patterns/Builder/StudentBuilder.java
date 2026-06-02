package design_patterns.Builder;

public class StudentBuilder {
    String name;
    int age;
    String email;

    public StudentBuilder setName(String name) {

        this.name = name;

        return this;
    }
    public StudentBuilder setAge(int age) {

        this.age = age;
    
        return this;
    }
    public StudentBuilder setEmail(String email) {

        this.email = email;
    
        return this;
    }
    public Student build() {

        return new Student(this);
    }
}
