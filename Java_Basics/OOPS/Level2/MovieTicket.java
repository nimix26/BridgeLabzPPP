package OOPS.Level2;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Avengers", 12, 250);
        ticket.displayTicketDetails();
    }
}

