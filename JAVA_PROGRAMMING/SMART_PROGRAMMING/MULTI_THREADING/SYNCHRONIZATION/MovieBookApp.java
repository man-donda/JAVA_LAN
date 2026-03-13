import java.util.*;

// Using Synchronized Block :-
// When we have to synchronized only some perticualr area that time we can use Synchronized block method.
// Syntax : synchronized (object reference expression){

//          }

// Nore: synchronized block is far batter than synchronized method to use.

class BookTheatreSeat {
    int total_seats = 10;

    void bookSeat(int seats) {

        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());

        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println("\n"+seats + " Seat(s) booked successfully.");
                total_seats = total_seats - seats;
                System.out.println("Seat(s) left: " + total_seats+"\n");
            } else {
                System.out.println("\nSorry, Seat(s) cannot be booked...!!");
                System.out.println("Seat(s) left: " + total_seats+"\n");
            }
        }
      
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
        System.out.println("Hi " + Thread.currentThread().getName());
    }
}

public class MovieBookApp extends Thread {
    static BookTheatreSeat b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheatreSeat();

        MovieBookApp abc = new MovieBookApp();
        abc.seats = 7;
        abc.start();

        MovieBookApp xyz = new MovieBookApp();
        xyz.seats = 6;
        xyz.start();
    }
}