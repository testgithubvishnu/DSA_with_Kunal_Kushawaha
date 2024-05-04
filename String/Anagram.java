import java.util.*;
public class Anagram
{
    public static void main(String[] args)
    {
      
    Scanner sc = new Scanner(System.in);
    String str1=sc.nextLine();
     String str2=sc.nextLine();

     char[] arr1= new char[str1.length()];
     char[] arr2=new char[str2.length()];

     if(str1.length()!=str2.length())
     {
        System.out.println("Strings are not Anagram");
     }
     for(int i=0;i<str1.length();i++)
     {
        if(!arr1[i] && !arr2[i])
        {
            arr1[i]=str2.charAt(i);
            arr2[i]=str1.charAt(i);
        }
     }
    System.out.println(arr2);
}
}
