//Synchronized method can be usefull to perform synchronization
import java.lang.*;
class BookTheatreSeat
{
   int total_seats=12;
   synchronized  void Bookseat(int seats)
   {
           if(total_seats>= seats)
           {
             System.out.println(seats+" seats booked successfully");
             total_seats=total_seats-seats;
             System.out.println("Seats Left: "+total_seats);
           }
           else
           {
            System.out.println("Sorry seats cannot be booked...");
            System.out.println("Seats Left: "+total_seats);
           }
   }  
}

public class MovieBookApp extends Thread
{
    static BookTheatreSeat b;
    int seats;

    public void run()
    {
        b.Bookseat(seats);
    }

    public static void main(String[] args)
    {
        b= new BookTheatreSeat();

        MovieBookApp deepak = new  MovieBookApp();
         deepak.seats=7;
         deepak.start();

         MovieBookApp Naresh=new MovieBookApp();
         Naresh.seats=6;
         Naresh.start();
    }
}