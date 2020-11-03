package in.hoptec;

public class  tmp {


    // start 12:40 AM

    public static void main(String[] args) {

        Node root=new Node(1);
        root.next=new Node(2);
        root.next.next=new Node(3);
        root.next.next.next=new Node(4);
        root.next.next.next.next=new Node(5);
        root.next.next.next.next.next=new Node(6);
        root.next.next.next.next.next.next=new Node(7);
        root.next.next.next.next.next.next.next=new Node(8);

        PrintUtil.print(root);
        midElement(root,1);

    }

    public static int midElement(Node n,int curDepth){

        if(n.next==null)
            return curDepth;

        int depth=midElement(n.next,curDepth+1);

        if(curDepth-1==depth/2){
            System.out.println(n.val);
        }

        return depth;
    }

}
