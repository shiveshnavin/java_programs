package in.hoptec;

public class LinkedListMid {

    public static void main(String[] args) {

        Node node=new Node(1);
        node.next=new Node(2);
        node.next.next=new Node(3);
        node.next.next.next=new Node(4);
        node.next.next.next.next=new Node(5);
        node.next.next.next.next.next=new Node(6);
        node.next.next.next.next.next.next=new Node(7);
        node.next.next.next.next.next.next.next=new Node(8);

        printmid(node,1);

    }

    public static int printmid(Node cur,int curDepth){
        if(cur.next==null){
            return curDepth;
        }

        int dept =  printmid(cur.next,curDepth+1);
        if(dept/2+1 == curDepth){
            PrintUtil.print(cur.val);
        }
        return dept;
    }
}
