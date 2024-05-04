import java.util.*;
public class pro2
{
    private int[] data;
    private int top;
    public static final int DEFAULT_CAPACITY=10;

    pro2(){
    data=new int[DEFAULT_CAPACITY];
    top=-1;
    }

    pro2(int capacity) throws Exception{
    if(capacity<1)
    {
        throw new Exception ("Invalid stack capacity!");
    }
    data=new int[capacity];
    top=-1;
    }

    public int getSize()
    {
        return top+1;
    }

    public void push(int item) throws Exception
    {
          if(getSize()==data.length)
          {
            throw new Exception ("Stack is Full!");
          }
          top++;
          data[top]=item;
        
    }

    public int pop() throws Exception
    {
        if(getSize()==0)
        {
            throw new Exception("Stack is Empty!");
        }
        int ans=data[top];
        top--;
        return ans;
    }

    public int peek() throws Exception
    {
         if(getSize()==0)
        {
            throw new Exception("Stack is Empty!");
        }
        return data[top];
    }

    public void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(data[i]);
        }
    }

    public boolean isEmpty()
    {
        
            return getSize()==0;
    }



}