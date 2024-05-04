import java.util.*;
public class DSA_Iterator
{
    public static void main(String[] args)
    {
   ArrayList<Integer> arr= new ArrayList<>();
   arr.add(1);
   arr.add(2);
   arr.add(5);
   arr.add(7);
   arr.add(4);


//Using iterator
   Iterator<Integer> it = arr.iterator();
   while(it.hasNext())
   {
    System.out.println(it.next());
   }

   //System.out.println(arr);


    }
}