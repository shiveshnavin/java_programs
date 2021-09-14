package in.hoptec;

// https://www.geeksforgeeks.org/flattening-a-linked-list/
public class LinkedListFlatten {

    public static void main(String[] args) {

        /* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */

        DeepNode head = new DeepNode(5);
        head.push(7).push(8).push(30);

        head.next = new DeepNode(10) ;
        head.next.push(20);

        head.next.next = new DeepNode(19) ;
        head.next.next.push(22).push(50);

        head.next.next.next = new DeepNode(28) ;
        head.next.next.next.push(35).push(40).push(45);

        DeepNode cur = head;
        while (cur!=null){
            String line = "";
            Node internal = cur.list;
            while (internal!=null){
                line = line + " > "+internal.val;
                internal = internal.next;
            }
            System.out.println(cur.val+"---> "+line);
            cur = cur.next;
        }

        head = flat(head);

        while (head!=null){
            System.out.println(head.val);
            head = head.list;
        }

    }


    public static DeepNode flat(DeepNode head){

        if(head==null || head.next==null)
            return head;
        head.next = flat(head.next);
        head = merge(head,head.next);
        return head;

    }

    public static DeepNode merge(DeepNode left, DeepNode right){
        if(left==null)
            return right;
        if(right==null)
            return left;

        DeepNode res = null;

        if(left.val < right.val){
            res = left;
            res.list = merge(res.list,right);
        }
        else {
            res = right;
            res.list = merge(left,res.list);
        }
        res.next = null;
        return res;
    }
}
