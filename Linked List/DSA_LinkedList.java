
    // operations on LinkedList:
    // 1] Add  
    // 2]remove
    // 3]get
    // 4] getsize
    // 5] display
    //       1]first
    //       2]specific position
    //       3]last
      

public class DSA_LinkedList
{
    private DSA_Node head;
    private DSA_Node tail;
    private int size;

    DSA_LinkedList()
    {
        head=tail=null;
        size=0;
    }
    public void addFirst(int data)
    {
        DSA_Node n= new DSA_Node(data);
        n.next=head;
        head=n;
        size++;

        if(size==0)
        {
            tail=n;
        }

    }

     public void addLast(int data)
    {
        DSA_Node n= new DSA_Node(data);
        if(size==0)
        {
            head=tail=n;
        }
        tail.next=n;
        tail=tail.next;
        size++;
    }

     public void addAt()
    {
    
    }

    public void display()
    {
        DSA_Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}