package in.hoptec;

public class LinkListNumberSumList {


    public static Node add(Node n1,Node n2,Node s,int cr)
    {
        if(n1!=null || n2!=null)
        {
            int sum=n1==null?0:n1.val+  (n2==null?0:n2.val) + cr;
            if(sum>=10)
            {
                sum=sum-10;
                cr=1;
            }
            else {
                cr=0;
            }
            if(s==null)
            {
                s=new Node();

            }
            else
            {
                s.next =new Node();
                s=s.next;
            }
            s.val=sum;
            add(n1!=null?n1.next :null,n2!=null?n2.next :null,s,cr);
            return s;

        }
        return null;
    }

    public static void main(String [] args)
    {

        Node n1=new Node(7);
        n1.next =new Node(5);
        n1.next.next =new Node(9);
        n1.next.next.next =new Node(4);
        n1.next.next.next.next =new Node(6);


        Node n2=new Node(8);
        n2.next =new Node(4);

        Node sum=add(n1,n2,null,0);

        while (sum!=null)
        {
            System.out.printf(" "+sum.val);
            sum=sum.next;
        }


    }

}
