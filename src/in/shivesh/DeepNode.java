package in.shivesh;

public class DeepNode extends Node {

    DeepNode next;
    DeepNode list;
    private Node curListHead;

    public DeepNode(int v) {
        super(v);
    }

    public static DeepNode create(int data){
        return new DeepNode(data);
    }

    public DeepNode push(int data){
        if(list == null)
        {
            list = new DeepNode(data);
            curListHead=list;
        }
        else
        {
            curListHead.next = new DeepNode(data);
            curListHead=curListHead.next;
        }
        return this;
    }
}
