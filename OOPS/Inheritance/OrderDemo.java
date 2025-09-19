package BridgeLabzPPP.Inheritance;

// File: OrderDemo.java
class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId; this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped (Tracking: " + trackingNumber + ")";
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        Order o1 = new Order("O1001", "2025-09-15");
        ShippedOrder o2 = new ShippedOrder("O1002", "2025-09-16", "TRK123");
        DeliveredOrder o3 = new DeliveredOrder("O1003", "2025-09-12", "TRK999", "2025-09-18");

        System.out.println(o1.orderId + ": " + o1.getOrderStatus());
        System.out.println(o2.orderId + ": " + o2.getOrderStatus());
        System.out.println(o3.orderId + ": " + o3.getOrderStatus());
    }
}

