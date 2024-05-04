// Performing single task using multiple threads

import java.lang.*;
public class DSA_STMT  extends Thread
{
    
     public void run()                                        
     {
        System.out.println("Hello guys we are just kidding");  // execute by thread-0
     }
    public static void main(String[] args)
    {
          DSA_STMT t1= new DSA_STMT();                            
          t1.start();                                          // main thread
            DSA_STMT t2= new DSA_STMT();
          t2.start();
    
    }
}