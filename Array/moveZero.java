import java.util.*;
public class moveZero {
static void MoveZero(int[] arr,int n)
{
  int temp,j=0;
   for(int i=0;i<n;i++)
    {
        if(arr[j]==0  && arr[i]!=0)
        {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
        if(arr[j]!=0){
          j++;
        }
    }
    System.out.println(Arrays.toString(arr));
}

  public static void main(String[] args) {
    int[] array={0,4,3,0,0,2,5,0,7};
     MoveZero(array,array.length);
   
  }
}