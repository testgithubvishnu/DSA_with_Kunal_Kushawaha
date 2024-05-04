import java.lang.*;
public class DSA_Test extends Thread
{
        public void run()
        {
            System.out.println("Hello i am a thred");
        }
   
    public static void main(String[] args)
    {
        DSA_Test t= new DSA_Test();
        t.start();
    }
}