package Object_Oriented_Programming.OOPs_Intermediate.Projects;

import java.util.ArrayList;

class Bird {
    String name;
    boolean canFly;
    boolean canSwim;

    Bird(String name, boolean canFly, boolean canSwim) {
        this.name = name;
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    void show() {
        System.out.println(name + " | Fly: " + canFly + " | Swim: " + canSwim);
    }
}

public class BirdSanctuaryprolem {
    public static void main(String[] args) {

        ArrayList<Bird> list = new ArrayList<>();

        // Adding birds
        list.add(new Bird("Sparrow", true, false));
        list.add(new Bird("Duck", true, true));
        list.add(new Bird("Penguin", false, true));
        list.add(new Bird("Ostrich", false, false));

        System.out.println("All Birds:");
        for (Bird b : list) {
            b.show();
        }

        // Search flying birds
        System.out.println("\nFlying Birds:");
        for (Bird b : list) {
            if (b.canFly) {
                b.show();
            }
        }

        // Search swimming birds
        System.out.println("\nSwimming Birds:");
        for (Bird b : list) {
            if (b.canSwim) {
                b.show();
            }
        }
    }
}