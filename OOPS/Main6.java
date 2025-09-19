package BridgeLabzPPP.OOPS;

// Interface
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Qty: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

// Veg Item
class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount 10% on Veg items";
    }
}

// Non-Veg Item
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 50; // extra charge
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount 5% on Non-Veg items";
    }
}

// Main
public class Main6 {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer", 200, 2);
        FoodItem f2 = new NonVegItem("Chicken", 300, 2);

        f1.getItemDetails();
        System.out.println("Total: " + f1.calculateTotalPrice());

        f2.getItemDetails();
        System.out.println("Total: " + f2.calculateTotalPrice());
    }
}

