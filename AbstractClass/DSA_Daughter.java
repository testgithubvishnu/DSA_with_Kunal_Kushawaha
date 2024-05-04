public class DSA_Daughter extends DSA_Parent
{
 
    public DSA_Daughter(int age)
    {
        super(age);
    }
   
   //Abstract methods needs to be overriden
      @Override
    void career()
    {
       System.out.println("I want to be an Doctor");  
    }

    @Override
    void hobbies()
    {
        System.out.println("I like to watch movies");
    }
}