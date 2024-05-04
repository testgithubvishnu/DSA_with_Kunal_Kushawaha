
        // StringBuffer is mutable
        // Thread safe
        // efficient
        //StringBuilder is not thread safe

import java.util.*;
public class DSA_kkBuffer
{
    public static void main(String[] args)
    {
        //constructor 1
        StringBuffer buffer= new StringBuffer();
        System.out.println(buffer.capacity());  // 16

        //constructor 2
        StringBuffer buffer1= new StringBuffer("kunal kushavaha");

         //constructor 3
         StringBuffer buffer2= new StringBuffer(30);


        buffer.append("WeMake Happy");

       // buffer.append(" buddy");
       // buffer.insert(2," brothers ");
       // buffer.replace(0,2,"Manale");
       // buffer.delete(0,6);
       // buffer.reverse();

        String str= buffer.toString();
        System.out.println(str);
    }
}
