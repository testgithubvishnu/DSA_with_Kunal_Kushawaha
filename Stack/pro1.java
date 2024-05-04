import java.util.*;
public class pro1
{
    public static void main(String[] args) throws Exception
    {
        pro2 obj= new pro2(5);
        obj.push(34);
        obj.push(29);
        obj.push(83);
        obj.push(52);

        // int a=obj.pop();
        // System.out.println("popped item:"+a);

        obj.display();
        System.out.println("Top of Stack:"+obj.peek());

    }
}