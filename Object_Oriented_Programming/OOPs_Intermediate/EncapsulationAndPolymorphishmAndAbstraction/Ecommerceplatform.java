package Object_Oriented_Programming.OOPs_Intermediate.EncapsulationAndPolymorphishmAndAbstraction;

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation
    public double getPrice() { return price; }
    public String getName() { return name; }

    public void setPrice(double price) { this.price = price; }

    // Abstract
    abstract double calculateDiscount();
}

// Electronics
class Electronics extends Product implements Taxable {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}

// Clothing
class Clothing extends Product implements Taxable {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}

// Groceries (No Tax)
class Groceries extends Product {

    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

// Main Class
public class Ecommerceplatform {
    public static void main(String[] args) {

        Product[] products = {
            new Electronics(1, "Laptop", 50000),
            new Clothing(2, "Shirt", 2000),
            new Groceries(3, "Rice", 1000)
        };

        for (Product p : products) {
            double price = p.getPrice();
            double discount = p.calculateDiscount();

            double tax = 0;

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                System.out.println(t.getTaxDetails());
            }

            double finalPrice = price + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------");
        }
    }
}