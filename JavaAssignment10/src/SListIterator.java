public class SListIterator {

    public boolean hasNext(Node node)
    {
        if(node.next!=null)
            return true;
        return false;
    }
    public Node getNext(Node node)
    {
        return node.next;
    }


}
