import java.lang.*;

// Sleep method throws interrupted exception
public class MT_sleep extends Thread
{
    public static void main(String[] args)
    {
          for(int i=0;i<9;i++)
          {
            try
            {
            
             // To delay the execution of the task 
             //Thread.sleep(Time(nanoseconds))
             Thread.sleep(2000);
            System.out.println(i);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
          }
    }
}