// Annotations are used to provide supplemental information about a program. 

// Annotations start with ‘@’.
// Annotations do not change the action of a compiled program.
// Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods, classes, etc.
// Annotations are not pure comments as they can change the way a program is treated by the compiler. See below code for example.
// Annotations basically are used to provide additional information, so could be an alternative to XML and Java marker interfaces.
class phone{
    public void shotime()
    {
        System.out.println("it is morning");
    }

}
class newphone extends phone{
    @Override
    // when we use this notation it is necessary that child class must override parent class method
     public void shotime()
    {
        System.out.println("it is morning");
    }


}
public class DSA_Annotation
{
    public static void main(String[] args)
    {
         newphone obj = new newphone();
         obj.shotime();
    }
}