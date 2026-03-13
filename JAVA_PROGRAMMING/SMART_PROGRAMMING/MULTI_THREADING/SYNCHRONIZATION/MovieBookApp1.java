import java.util.*;

// Using Synchronized Method :-
// When we have to synchronized whole method that time we can use Synchronized method.

class BookTheatreSeat1 {
    int total_seats = 10;

    synchronized void bookSeat1(int seats) {

        if (total_seats >= seats) {
            System.out.println("\n" + seats + " Seat(s) booked successfully.");
            total_seats = total_seats - seats;
            System.out.println("Seat(s) left: " + total_seats + "\n");
        } else {
            System.out.println("\nSorry, Seat(s) cannot be booked...!!");
            System.out.println("Seat(s) left: " + total_seats + "\n");
        }

    }
}

public class MovieBookApp1 extends Thread {
    static BookTheatreSeat1 b;
    int seats;

    public void run() {
        b.bookSeat1(seats);
    }

    public static void main(String[] args) {
        b = new BookTheatreSeat1();

        MovieBookApp1 pqr = new MovieBookApp1();
        pqr.seats = 7;
        pqr.start();

        MovieBookApp1 mno = new MovieBookApp1();
        mno.seats = 6;
        mno.start();
    }
}
