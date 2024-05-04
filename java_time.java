import java.time.*;
public class java_time {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
  
    LocalTime myObj1 = LocalTime.now(); // Create a time object
    System.out.println(myObj1);

     LocalDateTime myObj2 = LocalDateTime.now();
    System.out.println(myObj2); 
  }
}