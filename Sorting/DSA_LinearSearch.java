import java.util.*;
public class DSA_LinearSearch
{
    static void linearSearch(int[] x,int n,int tar)
    {
        for(int i=0;i<n;i++)
        {
            if(x[i]==tar)
            {
                System.out.println("Item is present at: "+(i+1)+" position");
         
            }
            else{
                System.out.println("Item is not present");
            }
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

        System.out.println("Enter the number  to search:");
        int target=sc.nextInt();
        
         linearSearch(arr,size,target);
     }
}
