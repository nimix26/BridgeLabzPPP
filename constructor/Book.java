class Book {
    String title;
    String author;
    double price;

   
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

  
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
