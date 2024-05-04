public class DSA_Son extends DSA_Parent
// Abstract class needs to be extended by other classes
{
     
  public DSA_Son(int age)
  {
    super(age);
  }
   //Abstract methods needs to be overriden
    @Override
    void career()
    {
       System.out.println("I want to be an Engineer");  
    }

    @Override
    void hobbies()
    {
        System.out.println("I like to cooking");
    }
    
   // void normal()
   // method does not override or implement a method   from a supertype @Override
   // already defined in parent can't be overriden
      @Override
     void normal()
    {
        super.normal();
    }
}