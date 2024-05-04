public class Book{
    int id;
    String name;
    int price;

    public Book(String name,int id,int price)
    {
        this.name=name;
        this.id=id;
        this.price=price;
    }

  @Override
    public String toString()
    {
        return "Book{"+"id="+id+ ",name="+ name +", price="+price+'}';
    } 
}