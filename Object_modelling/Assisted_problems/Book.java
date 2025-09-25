import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBook() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book b) {
        books.add(b);
    }

    void showLibraryBooks() {
        System.out.println("\nLibrary: " + name);
        for (Book b : books) {
            b.showBook();
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Python Guide", "Guido van Rossum");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // Same book can exist independently

        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}
