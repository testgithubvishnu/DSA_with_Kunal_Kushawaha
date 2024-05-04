public class DSA_QueueMain
{
    public static void main(String[] args) throws Exception
    {
      DSA_Queue obj=new DSA_Queue(4);
      obj.enqueue(34);
      obj.enqueue(28);
      obj.enqueue(67);
      obj.enqueue(92);
      //obj.enqueue(12);
      
    int b=obj.peek();
      System.out.println("item peeked:"+b);   

      int a=obj.dequeue();
      System.out.println("item removed:"+a);   

       obj.display();


    }
}