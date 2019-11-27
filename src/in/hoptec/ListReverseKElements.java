package in.hoptec;

public class ListReverseKElements {
    //https://www.geeksforgeeks.org/print-the-last-k-nodes-of-the-linked-list-in-reverse-order/


    public static int transverseRevUptoK(Node n, int K){

        if (n!=null)
        {
            int kt= transverseRevUptoK(n.next, K);

            if(kt<K)
            {
                System.out.print(" "+n.val);

            }
            return kt+1;

        }
        return 0;

    }

    public static void main(String [] args)
    {
        Node root;
        root=new Node(0);
        Node ptr=root;
        for(int i=1;i<7;i++)
        {
            ptr.next =new Node(i);
            ptr=ptr.next;
        }

        transverseRevUptoK(root,3);

    }

}
