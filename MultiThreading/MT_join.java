import java.lang.*;
// join() method in Thread:
// if a thread wants to wait for another thread to complete its task then we should use join() method

//   For example:

//   Licence (person) : If a person applied for licence then
//   thread 1:medical , thread 2:test-drive ,  thread 3:officer
//   next thread will wait for previous thread to be join
    
import java.lang.*;
public class MT_join extends Thread

{
       static  Thread mainthread;
       public void run()
 {
       try
       {
         mainthread.join();      //child thread will wait to join main thread after it's complete execution
         for(int i=0;i<7;i++)
          {
            System.out.println("chilld thread :"+i);
            Thread.sleep(1000);
          }
       }
       catch(Exception e)
        {
         System.out.println(e);
        }
 }
    public static void main(String[] args) throws InterruptedException
    {
        mainthread=Thread.currentThread();
         MT_join t1 = new MT_join();
         t1.start();
           // throws InterruptedException we have to add
           //t1.join();          
          // child thread will join main thread after it's complete execution
                            
    try
       {
         for(int i=0;i<7;i++)
          {
            System.out.println("main thread"+i);
            Thread.sleep(1000);
          }
       }
       catch(Exception e)
        {
         System.out.println(e);
        }
 
    }
}