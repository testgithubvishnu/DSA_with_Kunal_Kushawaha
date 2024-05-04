//implements Set nterface
//elements are automatically arranged in sorted order
import java.util.*;
public class DSA_Treeset
{
    public static void main(String[] args)
    {
        // TreeSet ts= new TreeSet();
        TreeSet<Integer> ts1= new TreeSet<Integer>();
        // TreeSet ts1= new TreeSet(SortedSet 34,12,53,12);
        ts1.add(97);
        ts1.add(24);
        ts1.add(38);
        ts1.add(81);
        ts1.add(15);
        ts1.add(64);
          
        //   System.out.println(ts);

        //initial set
          System.out.println(ts1);

         // descending set
          // System.out.println(ts1.descendingSet());

         //headset
           //System.out.println(ts1.headSet(81)); 

         //tailset
            //System.out.println(ts1.tailSet(38));

          //subset
             //System.out.println(ts1.subSet(24,15));
          


    }
}