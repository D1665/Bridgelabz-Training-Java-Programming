class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable (static)
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment when object is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("-----------------------");
    }

    // Class method (static)
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

// Main class
public class ProductInventory {
    public static void main(String[] args) {

        // Creating objects
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 20000);
        Product p3 = new Product("Headphones", 3000);

        // Display product details
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Display total products
        Product.displayTotalProducts();
    }
}