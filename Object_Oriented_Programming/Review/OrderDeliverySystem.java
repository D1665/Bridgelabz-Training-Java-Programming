package Object_Oriented_Programming.Review;

import java.util.ArrayList;

abstract class DeliveryOrder {
    private int orderId;
    private String customerName;
    private double baseAmount;

    public DeliveryOrder(int orderId, String customerName, double baseAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.baseAmount = baseAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    abstract double calculateFinalPrice();

    void printOrderSummary() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Base Amount: " + baseAmount);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DeliveryOrder)) return false;
        DeliveryOrder other = (DeliveryOrder) obj;
        return this.orderId == other.orderId;
    }
}

interface Trackable {
    void trackShipment(String trackingId);
}

interface Returnable {
    void initiateReturn(String reason);
}

class StandardDelivery extends DeliveryOrder implements Trackable, Returnable {

    public StandardDelivery(int orderId, String customerName, double baseAmount) {
        super(orderId, customerName, baseAmount);
    }

    @Override
    double calculateFinalPrice() {
        return super.getBaseAmount();
    }

    @Override
    public void trackShipment(String trackingId) {
        System.out.println("Tracking Standard Delivery: " + trackingId);
    }

    @Override
    public void initiateReturn(String reason) {
        System.out.println("Return initiated (Standard): " + reason);
    }
}

class ExpressDelivery extends DeliveryOrder implements Trackable, Returnable {

    public ExpressDelivery(int orderId, String customerName, double baseAmount) {
        super(orderId, customerName, baseAmount);
    }

    @Override
    double calculateFinalPrice() {
        return super.getBaseAmount() * 1.20;
    }

    @Override
    public void trackShipment(String trackingId) {
        System.out.println("Tracking Express Delivery: " + trackingId);
    }

    @Override
    public void initiateReturn(String reason) {
        System.out.println("Return initiated (Express): " + reason);
    }

    void applyPromoCode() {
        System.out.println("5% discount applied");
    }

    void applyPromoCode(String promoCodeName) {
        System.out.println("10% discount applied using code: " + promoCodeName);
    }

    void applyPromoCode(String promoCodeName, int priority) {
        System.out.println("20% discount applied using code: " + promoCodeName + " with priority " + priority);
    }
}

class InternationalDelivery extends DeliveryOrder implements Trackable, Returnable {

    public InternationalDelivery(int orderId, String customerName, double baseAmount) {
        super(orderId, customerName, baseAmount);
    }

    @Override
    double calculateFinalPrice() {
        return super.getBaseAmount() * 1.15;
    }

    @Override
    public void trackShipment(String trackingId) {
        System.out.println("Tracking International Delivery: " + trackingId);
    }

    @Override
    public void initiateReturn(String reason) {
        System.out.println("Return initiated (International): " + reason);
    }
}

public class OrderDeliverySystem {
    public static void main(String[] args) {

        DeliveryOrder[] orders=new DeliveryOrder[3];

        orders[0] = new StandardDelivery(101, "Dinesh", 1000);
        orders[1] = new ExpressDelivery(102, "Rahul", 2000);
        orders[2] = new InternationalDelivery(103, "Amit", 3000);

        for (DeliveryOrder order : orders) {
            order.printOrderSummary();
            System.out.println("Final Price: " + order.calculateFinalPrice());
            System.out.println("----------------------");
        }

        ExpressDelivery exp = new ExpressDelivery(104, "Karan", 1500);
        exp.applyPromoCode();
        exp.applyPromoCode("SAVE10");
        exp.applyPromoCode("VIP20", 1);

        DeliveryOrder o1 = new StandardDelivery(201, "A", 1000);
        DeliveryOrder o2 = new ExpressDelivery(201, "B", 2000);

        System.out.println("Are orders equal? " + o1.equals(o2));
    }
}