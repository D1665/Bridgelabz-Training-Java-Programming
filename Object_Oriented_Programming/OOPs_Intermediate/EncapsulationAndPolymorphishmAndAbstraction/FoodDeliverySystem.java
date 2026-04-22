package Object_Oriented_Programming.OOPs_Intermediate.EncapsulationAndPolymorphishmAndAbstraction;

// Interface
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract Class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method
    abstract double calculateTotalPrice();

    // Concrete method
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Encapsulation (Getters only)
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// Veg Item Class
class VegItem extends FoodItem implements Discountable {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity(); // No extra charge
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.9; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on Veg Items";
    }
}

// Non-Veg Item Class
class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        double extraCharge = 50; // Extra charge for non-veg
        return (getPrice() * getQuantity()) + extraCharge;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.85; // 15% discount
    }

    @Override
    public String getDiscountDetails() {
        return "15% discount on Non-Veg Items";
    }
}

// Main Class
public class FoodDeliverySystem {

    // Polymorphic method
    public static void processOrder(FoodItem item) {
        System.out.println(item.getItemDetails());

        double total = item.calculateTotalPrice();
        System.out.println("Total Price: " + total);

        // Check if item supports discount
        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            System.out.println(d.getDiscountDetails());
            System.out.println("Price after discount: " + d.applyDiscount());
        }

        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        FoodItem veg = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 250, 1);

        processOrder(veg);
        processOrder(nonVeg);
    }
}