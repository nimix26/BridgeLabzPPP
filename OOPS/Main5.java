package BridgeLabzPPP.OOPS;

// Interface
interface Reservable {
    void reserveItem(String user);
    boolean checkAvailability();
}

// Abstract class
abstract class LibraryItem {
    private String itemId, title, author;
    private boolean isAvailable = true;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

// Book
class Book extends LibraryItem implements Reservable {
    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() { return 14; }

    @Override
    public void reserveItem(String user) { System.out.println("Book reserved by " + user); }

    @Override
    public boolean checkAvailability() { return true; }
}

// Magazine
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() { return 7; }

    @Override
    public void reserveItem(String user) { System.out.println("Magazine reserved by " + user); }

    @Override
    public boolean checkAvailability() { return true; }
}

// DVD
class DVD extends LibraryItem implements Reservable {
    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() { return 3; }

    @Override
    public void reserveItem(String user) { System.out.println("DVD reserved by " + user); }

    @Override
    public boolean checkAvailability() { return true; }
}

// Main
public class Main5 {
    public static void main(String[] args) {
        LibraryItem i1 = new Book("B101", "Java Basics", "James");
        LibraryItem i2 = new Magazine("M201", "Tech Mag", "Editor");
        LibraryItem i3 = new DVD("D301", "Inception", "Nolan");

        i1.getItemDetails();
        System.out.println("Loan Duration: " + i1.getLoanDuration() + " days");

        i2.getItemDetails();
        System.out.println("Loan Duration: " + i2.getLoanDuration() + " days");

        i3.getItemDetails();
        System.out.println("Loan Duration: " + i3.getLoanDuration() + " days");
    }
}

