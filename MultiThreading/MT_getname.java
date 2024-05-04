import java.util.*;

public class MT_getname extends Thread
{
      public void run()
        {
                                     // Execution by Thread-0
            System.out.println("This task completed by:"+Thread.currentThread().getName()+" Thread");
        }   
    public static void main(String[] args)
    {
        
        System.out.println("Hello Threads:");
         
         MT_getname t1 = new MT_getname();                                              // Execution by main thread
         t1.start();

          MT_getname t2 = new MT_getname();                                              // Execution by main thread
         t2.start();

          MT_getname t3 = new MT_getname();                                              // Execution by main thread
         t3.start();
        //To get the name of the thread:
        System.out.println("This task is completed by :"+Thread.currentThread().getName()+"Thread");

        //To test whether the thread is running or not
        System.out.println(Thread.currentThread().isAlive());

         //System.out.println(10/0);

        //To set the name of the thread:
        // Thread.currentThread().setName("Minakshi");
        // System.out.println(Thread.currentThread().getName());

        //System.out.println(10/0);

    }
}