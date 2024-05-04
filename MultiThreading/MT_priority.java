import java.util.*;

// to set or get the priority of the threads
//it is an integer value
// priorities ranges from 1-10
//1-MIN_PRIORITY , 10-MAX_PRIORITY,5-NORM_PRIORITY

// 1] public final void setPriority(int n)
// 2] public final int getPriority()

import java.lang.*;
public class MT_priority extends Thread
{
    public void run()
    {
        System.out.println("Thread task execution");
         System.out.println("Child thread priority:"+Thread.currentThread().getPriority());
        
    }
    public static void main(String[] args)
    {

    System.out.println("Main thread old priority:"+Thread.currentThread().getPriority());

    //set priority
    Thread.currentThread().setPriority(6);
    //Thread.currentThread().setPriority(MIN_PRIORITY);
     //Thread.currentThread().setPriority(MAX_PRIORITY);

     System.out.println("Main thread New priority:"+Thread.currentThread().getPriority());


    // by default priority of main thread is : 5
    // any other thread i.e child thread inherits the priority of parent class

     MT_priority t1 = new MT_priority();
     t1.start(); 
    }
}