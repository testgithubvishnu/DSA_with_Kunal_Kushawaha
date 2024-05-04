public class methodhide
{
    public static void main(String[] arg)
    {
        child ob= new child();
        System.out.println(ob.run(2));
    }
}
class parent
{
    static void run()
    {
        System.out.println("hey i am parent");
    }
}
class child extends parent
{
    public int run(int x)
    {  
        int sum=60;
        sum= sum+x;
        return sum;
    }
    
}