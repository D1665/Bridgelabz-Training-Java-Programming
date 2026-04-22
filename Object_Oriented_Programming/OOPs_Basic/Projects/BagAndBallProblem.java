package Object_Oriented_Programming.OOPs_Basic.Projects;

class Ball {
    String colour;
    int size;

    Ball(String colour, int size) {
        this.colour = colour;
        this.size = size;
    }

    void displayBall() {
        System.out.println("Ball Colour is: " + colour);
        System.out.println("Ball size is: " + size);
    }
}

class Bag {
    String brand;
    Ball ball;

    Bag(String brand, Ball ball) {
        this.brand = brand;
        this.ball = ball;
    }

    void displayBag() {
        System.out.println("Bag brand name is: " + brand);
        ball.displayBall();
    }
}

public class BagAndBallProblem {
    public static void main(String[] args) {

        Ball ball1 = new Ball("Red", 5);
        Bag bag1 = new Bag("Nike", ball1);

        bag1.displayBag();
    }
}