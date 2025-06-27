package in.shivesh;

public class Node {

    int val;
    Node prev =null;
    Node next =null;

    public Node(int v){
        val=v;
    }

    public Node( ){

    }

    public void print(){
        Node head = this;
        while (head!=null){
            System.out.print(" >"+head.val);
            head = head.next;
        }
        System.out.println("");
    }

    public void setVal(int va){
        this.val = va;
    }

    public int getVal() {
        return val;
    }

    public static Node sample(){
        return sample(1);
    }
    public static Node sample(int i){
        Node n = new Node(i++);
        n.next = new Node(i++);
        n.next .next= new Node(i++);
        n.next .next.next= new Node(i++);
        n.next .next.next.next= new Node(i++);
        n.next .next.next.next.next= new Node(i++);
        n.next .next.next.next.next.next= new Node(i++);
        return n;
    }


}
