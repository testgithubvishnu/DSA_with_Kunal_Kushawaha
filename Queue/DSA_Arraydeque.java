//the ArrayDeque in Java provides a way to apply resizable-array in addition 
// to the implementation of the Deque interface. 
// It is also known as Array Double Ended Queue or Array Deck. 
// This is a special kind of array that grows and allows users
//  to add or remove an element from both sides of the queue.

// Queue Interface: It is an Interface that is a FirstIn – 
// FirstOut Data Structure where the elements are added from the back.

// Deque Interface: It is a Doubly Ended Queue in which you can insert
//  the elements from both sides. It is an interface that implements the Queue.

  //why arraydeque?
// in ArrayList when we add an object in front end. 
// then every object shift towards right.
//  But in ArrayDeque we we add an object in front end, 
//  memory expands toward left and no object shift towards right.
//also time coplexity also matters in arraylist it is more than arraydeque
//in arralist it is o(n) where as in aarydeque it is o(n)

import java.util.ArrayDeque;
import java.util.Deque;
public class DSA_Arraydeque
{
    public static void main(String[] args)
    {
     ArrayDeque<Integer> ad= new ArrayDeque<Integer>();
     ad.add(6);
     ad.add(45);
     System.out.println(ad);
      System.out.println(ad.getFirst());

    
    }
}