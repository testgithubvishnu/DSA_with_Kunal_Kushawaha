package DSA_IN_JAVA;
import java.util.*;
import java.lang.*;
//JAVA ENCAPSULATION :
// To achieve thid do:
// declare class variables/attributes as private
// provide public get and set methods to  public class person

     class person
    {
        private int acc_no=12345;
        private int pin=459018;
    

    //getter
    public int get_pin()
    {
        return pin;
    }
    public int getacc_no()
    {
        return acc_no;
    }

    //setter
    public void set_pin(int new_pin)
    {
        this.pin=new_pin;
    }
    public void setacc_no(int new_acc_no)
    {
     this.acc_no=new_acc_no;
     
    }
    }

 public class get_and_set_method{

    public static void main(String[] args)
    {
        person obj =new person();

      obj.set_pin(239446);
          System.out.println(obj.get_pin());

        
         obj.setacc_no(234567) ; 
         System.out.println(obj.getacc_no()) ; 
    }
   
   
}