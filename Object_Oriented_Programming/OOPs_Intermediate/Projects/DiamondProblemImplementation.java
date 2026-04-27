package Object_Oriented_Programming.OOPs_Intermediate.Projects;

// 🔷 STEP 1: Base Class
class A {
    void show() {
        System.out.println("Class A method");
    }
}

// 🔷 STEP 2: Single inheritance (valid)
class B extends A {
    @Override
    void show() {
        System.out.println("Class B method");
    }
}

class C extends A {
    @Override
    void show() {
        System.out.println("Class C method");
    }
}

/*
🔴 STEP 3: This is NOT allowed in Java (Diamond Problem)

class D extends B, C {   ❌ ERROR
}

👉 Java does not support multiple inheritance with classes
👉 So Diamond Problem cannot occur here
*/


// ===============================
// ✅ SOLUTION USING INTERFACES
// ===============================

// 🔷 Interface A
interface X {
    default void display() {
        System.out.println("Interface X");
    }
}

// 🔷 Interface B
interface Y extends X {
    default void display() {
        System.out.println("Interface Y");
    }
}

// 🔷 Interface C
interface Z extends X {
    default void display() {
        System.out.println("Interface Z");
    }
}

// 🔷 Class implementing both → Diamond situation
class D implements Y, Z {

    // Must override to resolve ambiguity
    @Override
    public void display() {
        System.out.println("Class D resolves Diamond Problem");

        // calling specific interface methods
        Y.super.display();
        Z.super.display();
    }
}


// 🔷 MAIN CLASS
public class DiamondProblemImplementation {
    public static void main(String[] args) {

        // ==============================
        // 🔶 Using Classes (No Diamond)
        // ==============================
        B b = new B();
        b.show();

        C c = new C();
        c.show();

        System.out.println();

        // ==============================
        // 🔶 Using Interfaces (Diamond)
        // ==============================
        D obj = new D();
        obj.display();
    }
}
