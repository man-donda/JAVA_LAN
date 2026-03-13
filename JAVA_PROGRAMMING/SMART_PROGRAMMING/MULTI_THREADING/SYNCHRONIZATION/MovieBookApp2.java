import java.util.*;

// Using Static Synchronized :-
// When we create more than one object of "BookTheatreSeat2" then data inconsistancy problem will be rise. 
// As a solution of that problem we can use Static synchronized method.

class BookTheatreSeat2 {
    static int total_seats = 20;

    synchronized static void bookSeat2(int seats) {

        if (total_seats >= seats) {
            System.out.println("-> "+seats + " Seat(s) booked successfully.");
            total_seats = total_seats - seats;
            System.out.println("   Seat(s) left: " + total_seats );
        } else {
            System.out.println("-> Sorry, "+seats+" Seat(s) cannot be booked...!!");
            System.out.println("   Seat(s) left: " + total_seats);
        }
    }
}

class myThread1 extends Thread{
    BookTheatreSeat2 b;
    int seats;
    myThread1(BookTheatreSeat2 b, int seats){
        this.b = b;
        this.seats = seats;
    }

    public void run(){
        b.bookSeat2(seats);
    }
}

class myThread2 extends Thread{
    BookTheatreSeat2 b;
    int seats;
    myThread2(BookTheatreSeat2 b, int seats){
        this.b = b;
        this.seats = seats;
    }

    public void run(){
        b.bookSeat2(seats);
    }
}

public class MovieBookApp2{
    public static void main(String[] args) {

        BookTheatreSeat2 b1 = new BookTheatreSeat2();
        myThread1 t1 = new myThread1(b1, 7);
        t1.start();
        myThread2 t2 = new myThread2(b1, 6);
        t2.start();

        BookTheatreSeat2 b2 = new BookTheatreSeat2();
        myThread1 t3 = new myThread1(b2, 5);
        t3.start();
        myThread2 t4 = new myThread2(b2, 9);
        t4.start();
    }
}




