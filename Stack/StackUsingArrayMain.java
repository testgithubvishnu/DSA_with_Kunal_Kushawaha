import java.util.*;

public class StackUsingArrayMain
{
public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stack:");
        int size= sc.nextInt();
        
        // STATIC STACK
       // StackUsingArray obj= new StackUsingArray(size);

       // DYNAMIC STACK
       DynamicStack obj= new DynamicStack(size);
         
        obj.push(34);
        obj. push(56);
        obj.push(77);
        obj. push(42);
        obj.push(61);
        obj. push(19);
        
        obj.printStack();

        //   System.out.println("Size of the stack:");
        //   System.out.println(obj.getSize());

        // System.out.println("Top of the Stack:");
        // int b=obj.peek();
        // System.out.println(b);

        // int a=obj.pop();
        // System.out.println("popped item is: "+a);

        //  obj.printStack();
    }
}