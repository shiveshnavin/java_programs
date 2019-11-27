package in.hoptec;

public class LinkedListDoubly {

    public Node top,rear;
    public LinkedListDoubly()
    {

    }

    public static void main(String[] args) {
        LinkedListDoubly s=new LinkedListDoubly();
        s.add(4);
        s.add(6);
        s.add(8);
        s.add(10);
        s.print();
    }


    public void print( )
    {
        print(top);
        System.out.println("");
    }

    public void print(Node cur)
    {
        System.out.print(""+cur.val+" -> ");
        if(cur.next !=null)
            print(cur.next);
    }


    public void printRev( )
    {
        print(rear);
        System.out.println("");
    }
    public void printRev(Node cur)
    {
        System.out.print(""+cur.val+" -> ");
        if(cur.prev !=null)
            print(cur.prev);
    }

    public Node add(int data)
    {
        Node tmp=new Node(data);
        if(top==null||rear==null)
        {
            top=tmp;
        }
        else
        {
            rear.next =tmp;
        }
        tmp.prev =rear;
        rear=tmp;

        return top;
    }


    public void remove(Node cur,Node prev,int key)
    {
        if(prev==null)
        {
            top=null;
        }
        else if(cur.val==key)
        {
            prev.next =cur.next;
        }
        else if(cur.next !=null)
            remove(cur.next,cur,key);
    }



}
