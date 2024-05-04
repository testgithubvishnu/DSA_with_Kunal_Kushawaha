import java.util.*;
public class RemoveEven
{
  static void display(int[] arr)
  {
    System.out.println(Arrays.toString(arr));
  }

  static int[] removeEven(int[] arr)
  {
    int i,oddCount=0;
    for( i=0;i<arr.length;i++)
    {
        if(arr[i]%2!=0)
        {
            oddCount++;
        }
    }
      int[] newArr=new int[oddCount];
      for(i=0;i<arr.length;i++)
      {
        if(arr[i]%2!=0)
        {
            newArr[i]=arr[i];
        }
      }
      return newArr;
  }

  public static void main(String[] args)
  {
      int[] array={23,65,45,98,12,44};
       System.out.println("with even integers");
      display(array);

      int[]a=removeEven(array);
      System.out.println("without even integers");
      display(a);
  }
}