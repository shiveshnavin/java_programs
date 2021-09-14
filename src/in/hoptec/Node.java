package in.hoptec;

public class Node {

    int val;
    Node prev =null;
    Node next =null;

    public Node(int v){
        val=v;
    }

    public Node( ){

    }

    public void setVal(int va){
        this.val = va;
    }

    public int getVal() {
        return val;
    }
}
