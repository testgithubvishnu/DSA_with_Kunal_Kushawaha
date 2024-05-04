import java.lang.*;

// Sleep method throws interrupted exception
// we can throw any thread in sleep mode
public class MT_sleep1 extends Thread
{
    public void run()
     {
        
            try
             {
              for(int i=0;i<9;i++)
               {
                System.out.println(i);
                Thread.sleep(2000);                    // this task gone in sleep mode
               }
             }
            catch(Exception e)
             {
                System.out.println(e);
             }
         
     }

 public static void main(String[] args)
    {
            
            MT_sleep1 t1 = new MT_sleep1();
            t1.start();
            //System.out.println("Hello world");
            for(int j=0;j<9;j++)
            {                          
                System.out.println(j);         // this task executes parallely
            }

    }

}