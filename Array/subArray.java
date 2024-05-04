//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int sum = 0 ;
        ArrayList<Integer> result = new ArrayList<Integer>();
            //code here
            if(s > 0){
                for(int i=0; i<n; i++)
            {
                if(result.size() > 0){
                    result = new ArrayList<Integer>();
                   
                }
                 result.add(i+1);
                
                 for(int j = i; j < n ; j++)
                 {
                     
                      sum = sum +  arr[j];
                if(sum == s)
                {
                    result.add(j+1);
                    break;
                }
                 }
                  if(sum == s)
                {
                 
                    break;
                }
               sum =0 ;
                
            }
            if(sum != s){
                result = new ArrayList<Integer>();
                result.add(-1);
            }
            }
            else {
                result.add(-1);
               
            }
            return result;
    }
}