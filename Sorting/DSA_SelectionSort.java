import java.util.*;
public class DSA_SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr={23,54,12,64,93,42};
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
               if(arr[j]<arr[min])
               {
                min=j;
               }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
         System.out.println(Arrays.toString(arr));

    }
}