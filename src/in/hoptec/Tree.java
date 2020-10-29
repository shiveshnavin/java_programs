package in.hoptec;

public class Tree {



    public void l(int v)
    {
        l(""+v);
    }
    public void l(String v)
    {
        System.out.println(v);
    }

    Node root;
    public Tree()
    {

        root=new Node(4);
        insert(new Node(3),root);
        insert(new Node(6),root);
        insert(new Node(8),root);
        Node one=new Node(1);
        insert(one,root);
        insert(new Node(2),root);
        insert(new Node(5),root);

        transverse(root);
//        Node v=new Node(4);
//       // System.out.println("Depth-->"+ depthOfNode(root,one,0));
//        //System.out.println("Depth-->"+ height(one,0));
//        System.out.println("");
//        delete(root,6);
//        transverse(root);
        System.out.println("\n");
        System.out.println(depth());

    }

    public static void main(String[] args) {
        new Tree();
    }

    public int dp(Node cur){

        if(cur==null)
            return 0;

        return Math.max(dp(cur.prev),dp(cur.next))+1;
    }
    public int depth(){
        return dp(root);
    }

    public int height(Node t, int tDepth)
    {
        if(t==null)
            return tDepth-1;
        else
            return Math.max(height(t.prev,tDepth+1), height(t.next,tDepth+1));
    }
    public int depthOfNode(Node t, Node v, int myDepth)
    {
        if(t==null)
            return -1;
        if(v.val==root.val)
        {
            System.out.println("t.val==root.val");
            return 0;
        }
        else if(t.val==v.val)
            return myDepth;
        else
        {
            return Math.max(depthOfNode(t.prev,v,myDepth+1), depthOfNode(t.next,v,myDepth+1));
        }
    }

    void insert(Node child,Node parent)
    {
        if(parent==null)
        {

            return;
        }


        if(parent.val>child.val )
        {
            if(parent.prev !=null)
                insert(child,parent.prev);
            else
                parent.prev =child;
        }
        else if(parent.val<child.val)
        {
            if(parent.next !=null)
                insert(child,parent.next);
            else
                parent.next =child;
        }
        else {

        }




    }



    void transverse(Node root)
    {
        if(root==null){

            return  ;
        }

        if(root.prev !=null)
            transverse(root.prev);

        System.out.printf(" - "+(root.val));

        if(root.next !=null)
            transverse(root.next);



    }


    public boolean delete(Node cur,int val)
    {
        if(cur.val==val){

            return true;

        }
        if(cur.prev!=null && delete(cur.prev,val))
        {
            deleteFrom(cur,cur.prev);
        }
        if(cur.next!=null && delete(cur.next,val))
        {
            deleteFrom(cur,cur.next);
        }

        return false;
    }

    public void deleteFromParent(Node parent,Node cur,Node nVal)
    {
        if(cur==parent.prev)
        {
            parent.prev=nVal;
        }
        else
            parent.next=nVal;
    }

    public void deleteFrom(Node parent,Node cur)
    {
        if(cur.prev==null && cur.next==null)
        {
            deleteFromParent(parent,cur,null);
        }
        else if(cur.prev!=null && cur.next!=null){

            Node succ=successor(parent,cur.next);
            deleteFromParent(parent,cur,succ);
        }
        else if(cur.prev!=null)
        {
            deleteFromParent(parent,cur,cur.prev);
        }
        else if(cur.next!=null)
        {

            deleteFromParent(parent,cur,cur.next);
        }

    }

    public Node successor(Node par, Node cur)
    {
        if(cur.prev==null)
        {
            deleteFromParent(par,cur,null);
            return cur;
        }
        else
            return successor(cur,cur.prev);
    }




}
