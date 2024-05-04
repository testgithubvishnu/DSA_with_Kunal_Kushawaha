package DSA_IN_JAVA;
import java.util.*;

 class employee
{
    int id;
    String name;

    // default constructor
    public employee()
    {
        System.out.println("hey there");
    }

    //parameterized constructor
    public employee(String name,int id)
    {
        this.id=id;
        this.name=name;
    }
    public int get_id()
    {
        return id;
    }
     public String get_name()
    {
        return name;
    }
}

public class constructor_overloading{
    public static void main(String[] args)
    {
       // employee obj = new employee();
       employee obj= new employee("manisha",45);
     System.out.print(obj.get_id());
      System.out.print(obj.get_name());
    }
}