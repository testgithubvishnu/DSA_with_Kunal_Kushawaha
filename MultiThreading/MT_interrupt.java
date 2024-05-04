// interrupt method is used to interrupt an executing thread
// this method will apply only when thread is in sleeping or waiting state
// if thread is not in sleep() or wait() state it will behave normal
// throws interruptedException

import java.lang.*;
public class MT_interrupt extends Thread
{
      public void run()
      {  
     try
       {
         for(int i=0;i<7;i++)
          {
            System.out.println("child thread: "+i);
            Thread.sleep(1000);
          }
       }
       catch(Exception e)
        {
         System.out.println(e);
        }
 
    }

      
    public static void main(String[] args)
    {
      MT_interrupt t1= new   MT_interrupt();
      t1.start();
      t1.interrupt();

    }
}