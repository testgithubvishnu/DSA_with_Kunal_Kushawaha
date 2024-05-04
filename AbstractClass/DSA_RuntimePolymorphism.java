class Bike
{
    void run()
    {
        System.out.println("running Bike");
    }
}
class cycle extends Bike
{
    void run()
    {
        System.out.println("running cycle");
    }   
}
class  splendor extends cycle
{
    void run()
    {
        System.out.println("running safely with 60km");
    }
}

 public class DSA_RuntimePolymorphism
{
    

   public static void main(String[] args)
   {
    Bike a= new splendor();
    Bike b= new Bike();
    Bike c= new cycle();

    a.run();
    b.run();
    c.run();

    splendor d= new splendor();
    d.run();
   }
}