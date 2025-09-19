package BridgeLabzPPP.OOPS;

public class Book {
    static String libraryName = "City Library";

    final String isbn;
    String title, author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("ISBN001", "Java Basics", "James Gosling");
        Book.displayLibraryName();
        b1.displayDetails();
    }
}
