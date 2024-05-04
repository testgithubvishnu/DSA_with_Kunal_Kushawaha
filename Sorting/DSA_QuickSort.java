// INSERTION SORT ALGORITHM

import java.util.*;
public class DSA_QuickSort
{
    static void quickSort(int[] arr1,int n)
    {

    }

    static void display(int[] arr1)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int[] arr= new int[size];

        System.out.println("Enter the elements of array:");
        for(int i=0 ;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array after sorting:");
        quicksort(arr,size);
        display(arr);
    }
}