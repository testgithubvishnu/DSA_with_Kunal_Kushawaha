// As it implements the Set Interface, duplicate values are not allowed.
// Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
// NULL elements are allowed in HashSet.

import java.util.*;
public class DSA_Hashset
{
    public static void main(String[] args)
    {
     HashSet <Integer> hash= new HashSet<>(24);  
     hash.add(46); 
     hash.add(73); 
     hash.add(20); 
     hash.add(85); 
     hash.add(42); 
     hash.add(95); 

     //adding duplicate elements in the hashset
    // hash.add(95);

      //remove element
    //   hash.remove(85); 

    // // Iterating over hashSet items
      Iterator <Integer> i=hash.iterator();
      // Holds true till there is single element remainin
      while(i.hasNext())
     // Iterating over elements
    // using next() method
       System.out.println(i.next());

     System.out.println(hash);


     

    }
}