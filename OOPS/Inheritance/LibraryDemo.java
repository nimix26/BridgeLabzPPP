package BridgeLabzPPP.Inheritance;

// File: LibraryDemo.java
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title; this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear);
    }
}

class Author extends Book {
    private String authorName;
    private String bio;

    public Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName; this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + authorName);
        System.out.println("Bio: " + bio);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2023, "Nimit Goyal", "Student & Programmer");
        a.displayInfo();
    }
}

