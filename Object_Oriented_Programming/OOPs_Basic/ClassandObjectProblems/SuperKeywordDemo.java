package Object_Oriented_Programming.OOPs_Basic.ClassandObjectProblems;
// Parent class
class Animal {
    String name = "Animal";  // Parent variable

    // Parent constructor
    Animal() {
        System.out.println("Animal Constructor Called");
    }

    // Parent method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";  // Child variable

    // Child constructor
    Dog() {
        super();  // 1. Calls parent constructor (must be first line)
        System.out.println("Dog Constructor Called");
    }

    void display() {

        // 2. Access parent class variable
        System.out.println("Parent name using super: " + super.name);

        // Access child variable
        System.out.println("Child name: " + this.name);

        // 3. Call parent class method
        super.eat();

        // Child method logic
        System.out.println("Dog is barking");
    }
}

// Main class
public class SuperKeywordDemo {
    public static void main(String[] args) {

        // Creating object
        Dog d = new Dog();

        System.out.println("----------------");

        // Calling method
        d.display();
    }
}