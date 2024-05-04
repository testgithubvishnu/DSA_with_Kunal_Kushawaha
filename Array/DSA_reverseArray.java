import java.util.*;
public class DSA_reverseArray
{
    static void reverseArray(int[] arr,int start,int end)
    {
         while(start<end)
         {
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
         }
    }

    public static void main(String[] args)
    {
        int[] array= {23,45,76,37,97};
        reverseArray(array,0,array.length-1);

        for(int i=0;i<5;i++)
        {
            System.out.println(array[i]);
        }
    }
}