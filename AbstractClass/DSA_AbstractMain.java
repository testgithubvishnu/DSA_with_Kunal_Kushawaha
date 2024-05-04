 public class DSA_AbstractMain
 {
    public static void main(String[] args)
    {

  
  DSA_Son a= new DSA_Son(45);
     a.career();
    a.hobbies();
    a.normal();
    
   DSA_Daughter b= new DSA_Daughter(54);
     b.career();
     b.hobbies();
     System.out.println(b.age);
     System.out.println(b.VALUE);
     

    // DSA_Parent mom = new DSA_Parent(56);
    // error: DSA_Parent is abstract; cannot be instantiated
   
   
     // static method can be called without creating object

     // Dynamic method dispatch or runtime polymorphism
     DSA_Parent obj= new DSA_Daughter(45);
    // DSA_Parent  -> Reference
    //DSA_Daughter -> Tyoe of the object

     // what will access depends on object being refered by reference variable

     // overriden method is called through reference of superclass

     obj.career();

     DSA_Parent.detail();

    }
}