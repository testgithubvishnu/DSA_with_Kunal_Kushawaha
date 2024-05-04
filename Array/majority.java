//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
     static int majorityElement(int a[], int size) 
    {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < size; i++)
        {
            int count = 0;
            for (int j = 0; j < size; j++) 
            {
                if (a[i] == a[j])
                    count++;
            }
 
            // update maxCount if count of
            // current element is greater
            if (count > maxCount)
            {
                maxCount = count;
                index = i;
            }
        }
        if(maxCount>size/2)
        
            return a[index];
        else
        return -1;
    }
   
   
}