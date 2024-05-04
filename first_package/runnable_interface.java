 // Multi threading using Runnable interface
 
 class myThreadRunnable1 implements Runnable{
    int i=0;
    public void run()
    {
        while(i<6)
        {
        System.out.println("i am thread 1 not thread2");
        i++;
        }
    }
 }
 class myThreadRunnable2 implements Runnable{
    int i=0;
    public void run()
    {
        while(i<6)
        {
        System.out.println("i am thread 2 not thread1");
        i++;
        }
    }
 }

public class runnable_interface 
{
    public static void main(String[] args)
    {
        myThreadRunnable1 obj1 = new myThreadRunnable1();
        Thread t1=new Thread(obj1);

        myThreadRunnable2 obj2 = new myThreadRunnable2();
            Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}