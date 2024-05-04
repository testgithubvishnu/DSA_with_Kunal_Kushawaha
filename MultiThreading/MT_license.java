import java.util.*;

class Medical extends Thread
 {
     public void run()
     {
     try
     {
        System.out.println("Medical check-up started");
        Thread.sleep(2000);
        System.out.println("Medical check-up completed");
     }
     catch(Exception e)
     {
        System.out.println(e);
     }
     }
 }

 class Test_drive extends Thread
 {
     public void run()
     {
     try
     {
        System.out.println("Driving test started");
        Thread.sleep(2000);
        System.out.println("Driving test completed");
     }
     catch(Exception e)
     {
        System.out.println(e);
     }
     }
 }

 class Officer_sign extends Thread
 {
     public void run()
     {
     try
     {
        System.out.println("Officer takes the file ");
        Thread.sleep(2000);
        System.out.println("Officer gives the sign");
     }
     catch(Exception e)
     {
        System.out.println(e);
     }
     }
 }
public class MT_license 
{
      public static void main(String[] args) throws InterruptedException
 {
      Medical t1= new Medical();
      t1.start();
        
      t1.join();

      Test_drive t2= new Test_drive();
      t2.start();
       
       t2.join();

      Officer_sign t3 = new Officer_sign();
      t3.start();
 }
}

