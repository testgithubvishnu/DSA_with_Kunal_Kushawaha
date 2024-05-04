// Performing multiple task using multiple threads

import java.lang.*;
 class test1 extends Thread
     {
     public void run()
     {
        System.out.println("Playing Video");
     }
     }

     class test2 extends Thread
     {
     public void run()
     {
        System.out.println("Playing Music");
     }
     }

      class test3 extends Thread
     {
     public void run()
     {
        System.out.println("Writting report");
     }
     }

public class DSA_MTMT  
{
    public static void main(String[] args)
    {
          test1 t1= new test1();
          t1.start();
           test2 t2= new test2();
          t2.start();
           test3 t3= new test3();
          t3.start();
           
    
    }
}