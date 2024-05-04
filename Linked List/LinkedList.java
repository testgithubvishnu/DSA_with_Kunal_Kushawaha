public class LinkedList
{
    private Node head;
    private Node tail;
    private int size;

    LinkedList()
    {
        head=tail=null;
        size=0;
    }

    public void addFirst(int data)
    {
        Node n= new Node(data);
        if(size == 0)
         {
            head=tail=n;
         }
        n.next=head;
        head=n;

        size++;
    }

    public void addLast(int data)
    {
         Node n= new Node(data);
         if(size == 0)
         {
            head=tail=n;
         }
         tail.next=n;
         tail=tail.next;
         size++;

    }
    public void addAt(int data,int index) throws Exception

    {
       // Node n=new Node(data);
        if(index<0 || index>size)
        {
            throw new Exception("Index out of bound");
        }
        if(index==0)
        {
            addFirst(data);
        }
        else if(index==size)
        {
            addLast(data);
        }
        else{
            Node temp=head;
            for(int jump=1;jump<=index-1;jump++)
            {
              temp=temp.next; 
            }
              Node n= new Node(data);
              n.next=temp.next;
              temp.next=n;
              size++;
            
        }
    }

    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
}