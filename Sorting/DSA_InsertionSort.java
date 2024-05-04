// INSERTION SORT ALGORITHM

import java.util.*;
public class DSA_InsertionSort
{
     public static void main(String[] args)
    {
        int [] arr={23,54,12,64,93,42};
      for(int i=1;i<arr.length;i++)
      {
        int current=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>current)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;

      }
      System.out.println(Arrays.toString(arr));
    }

}