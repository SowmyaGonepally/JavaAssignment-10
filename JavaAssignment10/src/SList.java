public class SList {
    Node head;
    public static void print(SList list)
    {
         Node node=list.head;
          SListIterator iterator=iterator();
          while (iterator.hasNext(node))
          {
              System.out.print(node.data+"-> ");
              node=node.next;
          }
        System.out.print(node.data+"-> ");
        if(!iterator.hasNext(node))
             System.out.print("NULL");

    }
    public static SListIterator iterator()
    {
        return new SListIterator();
    }
    public void insert(SList list,int data)
    {
        Node insertNode=new Node(data);
        if(list.head==null)
        {
            list.head=insertNode;
        }
        else
        {
            Node node= list.head;
            SListIterator iterator=iterator();
            while (iterator.hasNext(node))
            {
                node=node.next;
            }
            node.next=insertNode;
        }
    }
    public void removeAtPos(SList list,int pos)
    {
        int i=1;
        Node node=list.head;
        SListIterator iterator=iterator();
        while (iterator.hasNext(node.next) && i<pos-1)
        {
            node=node.next;
            i++;
        }
          node.next=node.next.next;

    }

}
