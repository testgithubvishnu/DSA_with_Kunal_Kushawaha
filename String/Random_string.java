import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;
public class Random_string
{
    static String generate (int size)
    {
        StringBuffer sb= new StringBuffer(size);
        Random random = new Random();

        for(int i=0;i<size;i++)
        {
            int randomChar=97+(int)(random.nextFloat()*26);
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
    public static void main(String[] arg)
    {
       int n=20;
       String str=Random_string.generate(n);
      // System.out.println(str);

    //    String str1="hi  hey   d o";
    //    System.out.println(str1);
    //     System.out.println(str1.replaceAll("\\s",""));

         String arr="Manale Akshata Kamlkar from latur";
        String[] name=arr.split(" ");
        System.out.println(Arrays.toString(name));

        String[] sys=new String[name.length];
        int j=0;
        for(int i=name.length-1;i>=0;i--)
        {
            sys[j]=name[i];
            j++;
        }
        System.out.println(Arrays.deepToString(sys));

        //   rounding off
        //   DecimalFormat df= new DecimalFormat("0.  0000");
        //   System.out.println(df.format(7.2));
    }
}