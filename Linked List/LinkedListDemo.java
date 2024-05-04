public class LinkedListDemo
{
    public static void main(String[] args) throws Exception
    {
        // Node a= new Node(56);
        // Node b=new Node(45);
        // a.next = b;
        // System.out.println(a.data);
        // System.out.println(a.next.data);

        LinkedList list= new LinkedList();
        list.addFirst(56);
        list.addFirst(90);
        list.addLast(34);
        list.addAt(44,1);
        list.display();
    }
}