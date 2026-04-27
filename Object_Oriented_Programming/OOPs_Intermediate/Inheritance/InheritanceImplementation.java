package Object_Oriented_Programming.OOPs_Intermediate.Inheritance;

// Inheritance Demo Program

// 🔷 Parent Class (Base Class)
class Animal {
    String name = "Animal";

    void eat() {
        System.out.println("Animals eat food");
    }
}

// 🔷 Child Class (Single Inheritance)
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }

    // Method Overriding
    @Override
    void eat() {
        System.out.println("Dog eats meat");
    }

    void showName() {
        // using super keyword
        System.out.println("Parent name: " + super.name);
    }
}

// 🔷 Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// 🔷 Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// 🔷 Main Class
public class InheritanceImplementation {
    public static void main(String[] args) {

        // ==============================
        // 🔶 Single Inheritance
        // ==============================
        Dog d = new Dog();
        d.eat();      // overridden method
        d.bark();
        d.showName();

        System.out.println();

        // ==============================
        // 🔶 Multilevel Inheritance
        // ==============================
        Puppy p = new Puppy();
        p.eat();   // from Dog
        p.bark();  // from Dog
        p.weep();  // its own method

        System.out.println();

        // ==============================
        // 🔶 Hierarchical Inheritance
        // ==============================
        Cat c = new Cat();
        c.eat();   // from Animal
        c.meow();
    }
}