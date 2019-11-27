package in.hoptec.songadt;

public class LinkedList {

    private Node head,tail;
    int size;

    public void addSong(String t, int dur)
    {
        Node song=new Node(t,dur);
        addAtTail(song);
        size++;
    }

    private void addAtTail(Node newNode)
    {
        if(tail==null || head==null)
        {
           tail = newNode;
           head=tail;
        }
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }


    private void addAtHead(Node newNode)
    {
        if(tail==null || head==null)
        {
            tail = newNode;
            head=tail;
        }
        else
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    public int findSong(String t)
    {
         Node node=head;
         int pos=0;
         while (node!=null)
         {

             if(node.name.equals(t))
                 return pos;
             node= node.next;
             pos++;
         }

         return -1;
    }

    public void deleteAtPos(int pos)
    {
        if(pos>=size || pos<0)
        {
            System.out.println("Invalid Position");
            return;
        }
        Node node=head;
        while (pos-->0)
        {
            node = node.next;
        }

        if(node.next!=null)
        {
            node.next.prev=node.prev;
            node.prev.next=node.next;
        }
        if(node.prev!=null)
        {
            node.prev.next=node.next;
        }
        size--;

    }


    public Node getSongAtPos(int pos)
    {
        if(pos>=size || pos<0)
        {
            System.out.println("Invalid Position");
            return null;
        }
        Node node=head;
        while (pos-->0)
        {
            node = node.next;
        }

        return node;

    }

    public void swap(Node a,Node b)
    {

        Node tmp=new Node(b.name,b.dur);
        b.name=a.name;
        b.dur=a.dur;

        a.dur=tmp.dur;
        a.name=tmp.name;

    }
    public void sortList()
    {
        Node i=head;
        while(i.next!=null)
        {
            Node j=i;
            Node small=j;
            while (j.next!=null)
            {
                if(j.name.compareTo(small.name)<0)
                {
                    small=j;
                }
                j=j.next;
            }
            swap(i,small);
            i=i.next;
        }

    }

    public void display()
    {
        Node node=head;
        int pos=0;

        while (node!=null)
        {
            System.out.print("---> "+pos+++". "+node.name);
            node= node.next;
        }
        System.out.println("");
    }

}
