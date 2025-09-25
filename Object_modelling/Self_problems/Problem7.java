package Self problem;

import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<>();

    Order(int id) {
        this.orderId = id;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println(p.name + " - Rs." + p.price);
        }
    }
}

class Customer2 {
    String name;

    Customer2(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed Order " + o.orderId);
    }
}

public class Problem7 {
    public static void main(String[] args) {
        Customer2 c1 = new Customer2("Nimit");
        Order o1 = new Order(101);

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 500);

        o1.addProduct(p1);
        o1.addProduct(p2);

        c1.placeOrder(o1);
        o1.showOrder();
    }
}

