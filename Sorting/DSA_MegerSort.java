// MERGE-SORT USING DIVIDE AND CONQUER STRATEGY
class sort{

    void merge()
    {
        
    }
     
    void mergeSort(int[] x,int left,int right)
    {
         int middle;
         if(left<right)
         {
            middle=(left+right)/2;
            mergeSort(arr,left,middle);
            mergeSort(arr,middle+1,right);

            merge(arr,left,middle,right);
         }

    }

    void display(int [] arr)
    {
       for(int i=0;i<arr.length;i++)
       {
        System.our.print(arr[i]+" ")
       }
    }

}

public class DSA_Mergesort
{
    public static void mian(String[] args)
    {
        int arr[]={9,3,1,5,13,12};
        sort obj=new Sort();
        obj.mergeSort(arr,0,arr.length-1);
        obj.display(arr);

    }
}