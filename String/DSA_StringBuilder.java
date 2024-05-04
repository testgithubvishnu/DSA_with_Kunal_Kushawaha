import java.util.*;
public class DSA_StringBuilder
{
    public static void main(String[] rgs)
    {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch = (char)('a'+i);
           builder.append(ch);
        }
        System.out.print(builder); 
    }
}
