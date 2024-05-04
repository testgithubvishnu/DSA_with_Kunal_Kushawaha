package DSA_IN_JAVA;

// variable arguments:
// it can be created using following syntax:
// public static void func(int ...arr)
// {

// }
// now func can take zero or more than than this arguments

class varargs_in_java{
    public static int func(int x,int ...arr)
    {
     int result=x;
     for(int a:arr)
     {
        result+=a;
     }
     return result;
    }
    public static void main(String[] args)
    {
     System.out.println("sum is "+func(2,4,7,9,1));
    }

    

}