package in.hoptec;

public class ReverseList {
    public static class Node
    {
        int data;
        Node next;
        public Node(int d){data=d;}
    }

    void insert(int data)
    {
        Node tail=top;
        while (tail.next!=null)
        {
            tail=tail.next;
        }
        tail.next=new Node(data);
    }

    void print(Node top)
    {
        if (top!=null)
        {
            System.out.printf(" "+top.data);
            print(top.next);
        }
    }
    Node top;
    public ReverseList()
    {
        top=new Node(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);

        reverse(top,top);

        print(top);




    }

    Node reverse(Node cur,Node top)
    {
        if(cur==null)
        {
            return cur;
        }

        else if(cur.next!=null)
        {
            top=top.next;
            top.data=reverse(cur.next,top).data;

        }
        return cur;
    }


}
