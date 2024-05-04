import java.util.*;
public class DSA_BinarySearch
{
    static void binarySearch(int[] x,int item)
     {
        int low=0,high=x.length-1;
        
        while(low<=high)
         {
            int mid=(low+high)/2;

            if(x[mid]==item)
            {
              System.out.println("Item is present at index "+mid);  
              break;
            }

             else if(x[mid]>item)
            {
               high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            
         }
         if(low>high)
            {
            System.out.println("Item is not present in array");   
            }
  
        }
     

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int[] arr={23,31,42,59,61,79,83,90};
        System.out.println("Enter the item to search:");
        int target = sc.nextInt();

        binarySearch(arr,target);
        
    }
}