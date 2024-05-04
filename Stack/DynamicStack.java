import java.util.*;
public class DynamicStack extends StackUsingArray
{
     DynamicStack() throws Exception
    {
      super();  
       // call StackUsingArray() 
    }
     DynamicStack(int sz) throws Exception
    {
      super(sz);
       // call StackUsingArray(int size) 
    }
    //@override
    public void push(int item)
    {
      if(this.isFull())
      {
         // douvle thw size of array
         int[] temp=new int[data.length*2];
         for(int i=0;i<data.length;i++)
         {
            temp[i]=data[i];
         }
         data=temp;
      }  
      
    }
}