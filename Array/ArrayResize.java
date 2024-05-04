import java.util.*;

public class ArrayResize{
   public int[] reSize(int[] arr,int capacity)
   {
    int[] temp=new int[capacity];
    for(int i=0;i<arr.length;i++)
    {
        temp[i]=arr[i];  
     }
   
   arr=temp;
   return arr;
  }


    public static void main(String[] args)
    {
    ArrayResize obj= new ArrayResize();

    int[] original= new int[]{2,5,3,8,6};
    System.out.println("Size of original Array: "+original.length);

    original=obj.reSize(original,10);
     System.out.println("Size of resized Array: "+original.length);

    }
}

