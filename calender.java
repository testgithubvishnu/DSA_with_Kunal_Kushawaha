// Date getTime(): It is used to return a
// Date object representing this
// Calendar's time value.
  
import java.util.*;
public class calender {
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();
        System.out.println("The Current Date is:" + c.getTime());
    }
}