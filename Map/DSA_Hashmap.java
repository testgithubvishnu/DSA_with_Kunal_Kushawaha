
import java.util.HashMap;
import java.util.Map;
public class DSA_Hashmap
{
    public static void main(String[] args)
    {
        HashMap <Integer,String> hashmap = new HashMap<>();
        hashmap.put(1,"amisha");
        hashmap.put(4,"smita");
        hashmap.put(6,"jenny");
        hashmap.put(8,"vikas");
        System.out.println(hashmap);

        for(Map.Entry<Integer,String> itr:hashmap.entrySet())
        {
              int key =itr.getKey();
              String value=itr.getValue();
              
              System.out.println("key:"+key +" value:"+value);
        }
    }
}
