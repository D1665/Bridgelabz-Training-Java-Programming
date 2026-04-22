package Object_Oriented_Programming.OOPs_Intermediate.Projects;

import java.util.*;

// Interfaces
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Base class
class Bird {
    String name;

    Bird(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Bird: " + name);
    }
}

// Flying bird
class Sparrow extends Bird implements Flyable {
    Sparrow(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + " can fly");
    }
}

// Swimming bird
class Duck extends Bird implements Flyable, Swimmable {
    Duck(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + " can fly");
    }

    public void swim() {
        System.out.println(name + " can swim");
    }
}

// Sanctuary class
class BirdSanctuary {
    List<Bird> birds = new ArrayList<>();

    void addBird(Bird b) {
        birds.add(b);
    }

    void showFlyingBirds() {
        System.out.println("\nFlying Birds:");
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                b.display();
            }
        }
    }

    void showSwimmingBirds() {
        System.out.println("\nSwimming Birds:");
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                b.display();
            }
        }
    }
}

// Main
public class BirdSanctuaryApp {
    public static void main(String[] args) {
        BirdSanctuary sanctuary = new BirdSanctuary();

        sanctuary.addBird(new Sparrow("Sparrow"));
        sanctuary.addBird(new Duck("Duck"));

        sanctuary.showFlyingBirds();
        sanctuary.showSwimmingBirds();
    }
}
