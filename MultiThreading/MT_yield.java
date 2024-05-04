import java.lang.*;

 // THis yield() stops the execution of current thread 
 // and give chance to other threads fro execution
 // windows does not support
 // based on priority give chance

 
public class MT_yield extends Thread
{
    public void run()
    {
          Thread.yield();      // main execute first then child thread
        try
          {
           for(int i=0;i<5;i++)
           {
             System.out.println(i +":"+Thread.currentThread().getName());
           
           }
         }
    
        catch(Exception e)
         {
           System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
         MT_yield t1= new MT_yield();
          t1.start();    //t1 as thread

          //Thread.yield();  if you want main method to stop and provide chance to other thread

          for(int i=0;i<5;i++)
           {
             System.out.println(i +":"+Thread.currentThread().getName());
           
           }
            
    }
}
