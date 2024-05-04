import java.util.Map;
public class DSA_enum
{
    enum Week
    {
        monday,tuesday,wednsday,thursday,friday,saturday,sunday;

        // these are enum constants
        // public,static and final
        // since its final you cancreate child enums
        // data type is Week

        Week()
        {
            System.out.println("constructor for "+this);
        }
        // private and default
        // not public becoz we dont want to create object

        // internally: public static final Week monday= new Week();

    }

    public static void main(String[] args)
    {
      Week week;
      week=Week.monday;
      System.out.println(week);


    // Access all enum constants:
    //   for(Week day:Week.values())
    //   {
    //     System.out.print(day+",");
    //   }
    }
}