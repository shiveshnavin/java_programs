package in.shivesh;

public class LinkedListSingly {

    public Node top,rear;
    public LinkedListSingly()
    {

    }

    public static void main(String[] args) {
        LinkedListSingly s=new LinkedListSingly();
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

    public Node add(int data)
    {
        Node tmp=new Node(data);
        if(rear==null)
        {
            top=tmp;
            rear=tmp;
        }
        else
        {
            rear.next =tmp;
        }
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
