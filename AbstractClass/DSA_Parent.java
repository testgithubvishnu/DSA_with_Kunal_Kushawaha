public abstract class DSA_Parent
{
    int age;
    final int VALUE;
    
  public DSA_Parent(int age)
  {
      this.age=age;
      VALUE=346512;
  }
//error: DSA_Parent is abstract; cannot be instantiated

// we can't create object of an abstract class

// can't create abstract constructor of abstract class

// we can't create abstract static method becoz       these cant be overriden so,
 // abstract static void first()


    abstract void career();
    abstract void hobbies();

  
   // we can call static method without creating object of that class

   static void detail()
    {
        System.out.println("Hey i am Kunal");
    }

  // Normal methods
    void normal()
    {
        System.out.println("Hey this is normal method");
    }

}