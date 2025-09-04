package OOPS.Level2;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " items added to cart.");
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed from cart.");
        } else {
            System.out.println("Not enough items to remove!");
        }
    }

    public void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Headphones", 2000, 2);
        cart.displayTotalCost();
        cart.addItem(1);
        cart.displayTotalCost();
        cart.removeItem(2);
        cart.displayTotalCost();
    }
}

