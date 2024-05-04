// The Hashtable class implements a hash table, which maps keys to values
// A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
// Java Hashtable class contains unique elements.
// Java Hashtable class doesn't allow null key or value.
// Java Hashtable class is synchronized.
// The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
 import java.util.*;
public class DSA_Hashtable
{
    public static void main(String[] args)
    {
        Hashtable <Integer,String> hashtable = new Hashtable<Integer,String>();
        hashtable.put(1,"amisha");
        hashtable.put(4,"smita");
        hashtable.put(6,"jenny");
        hashtable.put(8,"vikas");
        System.out.println(hashtable);
        //to remove
        //hashtable.remove(1);

        for(Map.Entry<Integer,String> m:hashtable.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
