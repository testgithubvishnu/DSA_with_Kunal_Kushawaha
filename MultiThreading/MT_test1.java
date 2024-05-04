import java.lang.*;
// This programme shows what happened if we use run method instead of start()
  // 1] when we use start() method threads are created and execute simultaneously

  // 2] when we use run() main method executes , no threads are created,
   //  they behave like a objects  and execute one by one

   // method executes onre by one
   // threads executes simultaneously
  //  threads are more efficient than the methods

public class MT_test1 extends Thread
{
    public void run()
    {
        try
          {
           for(int i=0;i<5;i++)
           {
             System.out.println(i +":"+Thread.currentThread().getName());
             Thread.sleep(2000);
           }
         }
    
        catch(Exception e)
         {
           System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
         MT_test1 t1= new MT_test1();
        //  t1.start();    //t1 as thread
            t1.run();      //t1 as object

         MT_test1 t2= new MT_test1();
        //  t2.start();    //t2 as thread
            t2.run();      //t2 as object
    }
}