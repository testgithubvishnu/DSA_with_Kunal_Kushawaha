import java.util.*;
import java.util.Arrays;
public class array
{
    public static void main(String[] args)
    {
       //int[] arr={84,43,71,61,28,41};
      
       //For SORINTG of array
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

     //ARRAY TO STRING
    //   System.out.println(arr);
    //   System.out.println(Arrays.toString(arr));

      //Array FILL method
      // int[] arr=new int[10];
      // Arrays.fill(arr,13);
      // arr[0]=56;
      // System.out.println(Arrays.toString(arr));

      //TRAVERSAL OF ARRAY
      // using for loop

      //ENHANSED FRO LOOP
      // for(int x:arr)
      // {
      //   System.out.print(x+" ");
      // }

     int[][] arr={{1,2,3,4},{5,6,7,8},{3,6,9,12}};
     
     System.out.println(Arrays.toString(arr)) ;
     //[[I@76ed5528, [I@2c7b84de, [I@3fee733d]

      System.out.println(Arrays.deepToString(arr)) ;
      // [[1, 2, 3, 4], [5, 6, 7, 8], [3, 6, 9, 12]]


      

    }
}

// RAM = Stack + Heap

// Stack:
// functions are stored
// primitive variable


// Heap:
//  object stores in heap
//  arr is object reference
