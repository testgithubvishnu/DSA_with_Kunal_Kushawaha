import java.util.*;

public class DSA_Linked_list
{
public static void main(String[] arag)
{
   LinkedList<Integer> link= new LinkedList<>();
    link.add(23);
    link.add(83);
    link.add(98);
    link.add(18);


// Add elements to the linked list.
//        link.addFirst( 45);
//        link.addLast(100);
//        link.add(2, 32);

// Remove elements from the linked list
//        link.remove(83);
//        link.remove(3);

// Remove first and last elements
//         link.removeFirst();
//         link.removeLast();

// Get and set a value
//        link.getFirst();
 //       link.getLast();

// Integer int1=link.get(2);
//  link.Set(2, "changed");

// convert from linked list to array:
  // by using toArray() method
  
System.out.println("linked list:");
System.out.println(link);

Object[] arr =link.toArray();  
for(Object i :arr)
  System.out.println(i + " ");
}
}