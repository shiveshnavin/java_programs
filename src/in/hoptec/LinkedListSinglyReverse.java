package in.hoptec;

public class LinkedListSinglyReverse extends LinkedListSingly{

    public LinkedListSinglyReverse() {


    }

    public static void main(String[] args) {
        LinkedListSinglyReverse s=new LinkedListSinglyReverse();
        s.add(4);
        s.add(6);
        s.add(8);
        s.add(10);
        s.print();
        s.reverse();
        s.print();

    }

    public void reverse()
    {
        top=reverse(top,null);
    }


    // start 12:40 AM
    // stop 12:48 AM
    // Time 8 Mins
    public static Node reverse(Node curr,Node prev){

        Node next= curr.next;
        curr.next=prev;
        if(next==null)
        {
            return curr;
        }
        return reverse(next,curr);
    }

}
