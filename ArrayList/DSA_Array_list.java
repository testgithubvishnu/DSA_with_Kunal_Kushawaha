//ArrayList provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots 
//of manipulation in the array is needed.Array list in java allows us to generate array of variable size
 //
  
// ArrayList has the constructors shown here:
// ArrayList( )
// ArrayList(Collection<? extends E> c)
// ArrayList(int capacity)

import java.io.*;
import java.util.*;
public class DSA_Array_list{
    public static void main(String[] args)
    {
       
        ArrayList<Integer> arr1= new ArrayList<>();
        arr1.add(30);
        arr1.add(61);
        arr1.add(13);
        arr1.add(10);
        arr1.add(55);
        arr1.add(6);
        arr1.add(17);
        
        // System.out.println(arr1.contains(32));

        // for(int i=0;i<arr1.size();i++)
        // {
        //     System.out.println(arr1.get(i));
        // }

        // System.out.print(Collections.sort(arr1));
   
        //  int n=10;
        // ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

        // for(int i=0;i<=n;i++)
        // {
        //     arr1.add(i);
        // }
        // System.out.println(arr1);
        // arr1.set(1,56);
        // System.out.println(arr1);

        // arr1.remove(0);
        //  System.out.println(arr1);

        //sorting array:
        // ArrayList<Integer> list = new ArrayList();
        // list.add(2);
        // list.add(4);
        // list.add(3);
        // list.add(1);
        // System.out.println("Before sorting list:");
        // System.out.println(list);

        // Collections.sort(list);
        // System.out.println("after sorting list:");
        // System.out.println(list);

        // if(arr1.contains(30))
        // {
        //     System.out.println("contains 30");
        // }

        // for(int x:arr1)
        // {
        //     System.out.println(x+" ");
        // }

    }
}