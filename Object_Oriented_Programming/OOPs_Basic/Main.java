package Object_Oriented_Programming.OOPs_Basic;
// Parent class (Base class)
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// ------------------------------
// 1. Single Inheritance
// ------------------------------
class Dog extends Animal {   // Dog inherits Animal
    void bark() {
        System.out.println("Dog is barking");
    }
}

// ------------------------------
// 2. Multilevel Inheritance
// ------------------------------
class Puppy extends Dog {   // Puppy → Dog → Animal
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// ------------------------------
// 3. Hierarchical Inheritance
// ------------------------------
class Cat extends Animal {   // Another child of Animal
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// ------------------------------
// 4. Multiple Inheritance (using Interface)
// ------------------------------

// Interface 1
interface Father {
    void showFather();
}

// Interface 2
interface Mother {
    void showMother();
}

// Child class implementing multiple interfaces
class Child implements Father, Mother {
    public void showFather() {
        System.out.println("This is Father side");
    }

    public void showMother() {
        System.out.println("This is Mother side");
    }
}

// ------------------------------
// Main Class
// ------------------------------
public class Main {
    public static void main(String[] args) {

        // 🔹 Single Inheritance
        Dog d = new Dog();
        d.eat();   // from Animal
        d.bark();  // from Dog

        System.out.println("----------------");

        // 🔹 Multilevel Inheritance
        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy

        System.out.println("----------------");

        // 🔹 Hierarchical Inheritance
        Cat c = new Cat();
        c.eat();   // from Animal
        c.meow();  // from Cat

        System.out.println("----------------");

        // 🔹 Multiple Inheritance (via Interface)
        Child ch = new Child();
        ch.showFather();
        ch.showMother();
    }
}