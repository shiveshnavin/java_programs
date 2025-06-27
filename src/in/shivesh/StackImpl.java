package in.shivesh;

public class StackImpl {

    protected Node top;

    public StackImpl()
    {

    }

    public void push(int val)
    {
        Node tmp=new Node(val);
        if(top==null)
        {
            top = tmp;
        }
        else
        {
            tmp.next =top;
            top=tmp;
        }
    }

    public int pop()
    {
        if(top==null)
            return -1;
        else
        {
            int val=top.val;
            top=top.next;
            return val;
        }
    }

    public void printAll()
    {
        Node tmp=top;
        while (tmp!=null)
        {
            System.out.print(""+tmp.val+" ");
            tmp=tmp.next;
        }
        System.out.println("");
    }




}
