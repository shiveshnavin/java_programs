package in.hoptec;

public class LastKNodes {

    //10-48====11-16====11-35
    Node list;
    class Node
    {
        public Node(int data)
        {
            this.data=data;
        }
        public int data;
        public Node next;
    }

    public void insert(int data)
    {
        Node nw=new Node(data);
        if(list==null)
            list=nw;
        else
        {
            nw.next=list;
            list=nw;
        }
    }
    public LastKNodes()
    {
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        Node tst=list;
        while (tst!=null)
        {
            System.out.println(tst.data);
            tst=tst.next;
        }

        printLastK(list,2);


    }

    int ar[];
    void shiftInsert(int n)
    {
     for(int i=0;i<ar.length-1;i++)
     {
         ar[i]=ar[i+1];
     }
     ar[ar.length-1]=n;
    }

    int count=0;
    void printLastK(Node n,int k)
    {
        if(n==null)
            return;
        if(n.next!=null)
        {
            printLastK(n.next,k);
        }
        if(count>=k)
        {
            return;
        }
        else
        {
            count++;
            System.out.printf(n.data+" ");
        }

    }
    void printLastK(int k)
    {

        ar =new int[k];
        Node tst=list;
        while (tst!=null)
        {
            shiftInsert(tst.data);
            tst=tst.next;
        }

        while(k-->0)
        {
            System.out.printf(ar[k]+" ");
        }
    }
}
