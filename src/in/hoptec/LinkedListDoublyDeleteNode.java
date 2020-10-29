package in.hoptec;

import java.util.LinkedList;

public class LinkedListDoublyDeleteNode {

    public static Node delete(Node root, int val) {

        Node cur = root;
        if(root.val==val){
            return root.next;
        }
        while (cur != null) {
            if (cur.val == val)
                break;
            else
                cur = cur.next;

        }

        if (cur != null) {
            if(cur.prev!=null){
                cur.prev.next=cur.next;
            }
            if(cur.next!=null){
                cur.next.prev=cur.prev;
            }
        }

        return root;
    }

    public static void main(String[] args) {

        Node n = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);

        n.next = n1;

        n1.next = n2;
        n1.prev = n;

        n2.prev = n1;
        n2.next = n3;

        n3.prev = n2;
        n3.next = n4;

        n4.prev = n3;
        n4.next = n5;

        n5.prev = n4;

        Node root = n;

        Print.print(root);

        root=delete(root,1);
        Print.print(root);


        root=delete(root,6);
        Print.print(root);


    }


}
