package in.shivesh;

public class LinkedListDoublyReverse extends LinkedListDoubly{

    public LinkedListDoublyReverse() {


    }

    public static void main(String[] args) {
        LinkedListDoublyReverse s=new LinkedListDoublyReverse();
        s.add(4);
        s.add(6);
        s.add(8);
        s.add(10);
        s.printRev();
        s.reverse();
        s.print();

    }

    public void reverse()
    {
        top=reverse(top);
    }

    public Node reverse(Node cur)
    {
        Node newHead=null;
        if(cur.next !=null)
        {
            newHead=reverse(cur.next);
        }
        else
        {
            newHead=cur;
        }
        Node prev=cur.prev;
        cur.prev =cur.next;
        cur.next =prev;
        return newHead;
    }


}
