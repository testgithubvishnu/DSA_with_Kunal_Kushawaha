// STACK USING ARRAY

import java.util.*;
public class StackUsingArray
{
    protected int[] data;
    protected int top;
    public static final int DEFAULT_CAPACITY=10;

     StackUsingArray()
    {
       data=new int[DEFAULT_CAPACITY];
       top=-1;
    }

      StackUsingArray(int capacity) throws Exception
    {
        if(capacity<1)
        {
            throw new Exception("Invalid Stack Capacity!");
        }
       data=new int[capacity];
       top=-1;
    }


// TO CHECK IF STACK IS EMPTY
    public boolean isEmpty()
    {
        return getSize()==0;
    }

     public boolean isFull()
    {
        return getSize()==data.length;
    }

// TO GET SIZE OF THE STACK
    public int getSize()
    {
        return top+1;
    }

// TO PUSH ITEM IN THE STACK
    public void  push(int item) throws Exception
    {
        if(getSize()==data.length)
        {
             throw new Exception ("Stack is full");
        }
        top++;
        data[top]=item;
    }


//TO POP OUT ITEM FROM THE STACK
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception ("Stack is empty");
        }
        int ans=data[top];
        top--;
        return ans;
    }


//TO PEEK TOP OF THE STACK
    public int peek() throws Exception{
        if(getSize()==0)
        {
            throw new Exception("Stack is empty");
        }
        return data[top];

    }

// TO DISPLAY THE ITEMS OF THE STACK
    public void printStack()
  {
    for(int i=top;i>=0;i--)
    {
        System.out.println(data[i]);
    }
  }

}