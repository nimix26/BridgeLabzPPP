package BridgeLabzPPP.OOPS;

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class
abstract class Product {
    private String productId, name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public abstract double calculateDiscount();
}

// Electronics
class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.10; }

    @Override
    public double calculateTax() { return getPrice() * 0.18; }

    @Override
    public String getTaxDetails() { return "GST: 18%"; }
}

// Clothing
class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.20; }

    @Override
    public double calculateTax() { return getPrice() * 0.05; }

    @Override
    public String getTaxDetails() { return "GST: 5%"; }
}

// Groceries
class Groceries extends Product {
    public Groceries(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.05; }
}

// Main class
public class Main2 {
    public static void main(String[] args) {
        Product p1 = new Electronics("E101", "Laptop", 50000);
        Product p2 = new Clothing("C201", "Shirt", 2000);
        Product p3 = new Groceries("G301", "Rice", 1000);

        Product[] items = {p1, p2, p3};

        for (Product p : items) {
            double finalPrice = p.getPrice()
                                + (p instanceof Taxable ? ((Taxable)p).calculateTax() : 0)
                                - p.calculateDiscount();
            System.out.println("Final Price: " + finalPrice);
        }
    }
}

