import java.util.ArrayList;
import java.util.HashSet;
public class DSA_Arraylist1
{
    public static void main(String [] args)
    {
        ArrayList obj1= new ArrayList();
        obj1.add("nisha");
        obj1.add(34);
        obj1.add('C');
        obj1.add(34.56);
        obj1.add(true);

        System.out.println(obj1);

        HashSet obj2= new HashSet();
        obj2.add("nisha");
        obj2.add(34);
        obj2.add('C');
        obj2.add(34.56);
        obj2.add(true);

     System.out.println(obj2);
    }
}