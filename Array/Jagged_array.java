import java.util.*;
public class Jagged_array
{
    public static void main(String[] args)
    {
        //jagged array -> with variable no of cols in row
        Scanner sc= new Scanner(System.in);
       int i,j,rows;

        System.out.println("Enter the no. of rows");
         rows= sc.nextInt();
           
         int [][] arr=new int[rows][];
      

        for( i=0;i<rows;i++)
        {
            System.out.println("Enter no. of columns in currentRow");
             int colsInCurrentRow= sc.nextInt();

             System.out.println("Enter the data in currentRow:");
             arr[i]=new int[colsInCurrentRow];
             
            for( j=0;j<colsInCurrentRow;j++)
            {
                 
                arr[i][j]=sc.nextInt();
            }
        }
      System.out.println(Arrays.deepToString(arr));

    }
}