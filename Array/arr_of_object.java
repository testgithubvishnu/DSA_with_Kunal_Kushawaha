// Array of objects

class student
{
    private String name;
    private int age;

    student()
    {
        name="Akshata";
        age=21;
    }
    student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void setNameandAge(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void introduce()
    {
        System.out.println("my name is "+name+" and my age is "+age);
    }
}

public class arr_of_object
{
    public static void main(String[] args)
    {
    //   student anjali= new student();
    //   student anil= new student("anil",19);
    //   student shrushti= new student();

     // Here we can only store objects of same class i.e same type
      // array of objects same type i.e student

    //  studentobj[0]=anjali;
    //   studentobj[1]=anil;
    //   studentobj[2]=shrushti;

    //INSTEAD OF ABOVE WE CAN DO LIKE THIS ALSO

    int [] marks=new int[10];
    student[] studentobj=new student[3];
      
      studentobj[0]=new student();
      studentobj[1]=new student("anil",19);
      studentobj[2]=new student();
      
      
     
     // anjali.setNameandAge("kirti",23);
      studentobj[2].setNameandAge("Divya",43);

     // anjali.introduce();
      studentobj[0].introduce();
      studentobj[1].introduce();
      studentobj[2].introduce();

    }
}

