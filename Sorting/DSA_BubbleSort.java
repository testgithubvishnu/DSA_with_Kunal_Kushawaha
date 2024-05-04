import java.util.*;
public class DSA_BubbleSort
{
    // Bubble sorting
    // Time complexity =O(n^2)
    public static void main(String[] args)
    {
        int arr[]={23,56,84,39,21,98};
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
        

        System.out.println(Arrays.toString(arr));
    }
}
