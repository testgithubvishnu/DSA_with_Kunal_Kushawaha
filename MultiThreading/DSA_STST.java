// Performing single task using single threads

import java.lang.*;
public class DSA_STST  extends Thread
{
    
     public void run()
     {
        System.out.println("Hello guys we are just kidding");
     }
    public static void main(String[] args)
    {
          DSA_STST t1= new DSA_STST();
          t1.start();
           
    
    }
}