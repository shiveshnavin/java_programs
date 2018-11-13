package in.hoptec;

public class TreeTest {

    public void l(int v)
    {
        l(""+v);
    }
    public void l(String v)
    {
        System.out.println(v);
    }


    public TreeTest()
    {

        Node parent=new Node(4);
        insert(new Node(3),parent);
        insert(new Node(6),parent);
        insert(new Node(8),parent);
        insert(new Node(1),parent);
        insert(new Node(2),parent);
        insert(new Node(5),parent);

        transverse(parent);


    }

    void insert(Node child,Node parent)
    {
        if(parent==null)
        {

           return;
        }


        if(parent.val>child.val )
        {
            if(parent.left!=null)
                insert(child,parent.left);
            else
                parent.left=child;
        }
        else if(parent.val<child.val)
        {
            if(parent.right!=null)
                insert(child,parent.right);
            else
                parent.right=child;
        }
        else {

        }




    }



    void transverse(Node root)
    {
        if(root==null){

            return  ;
        }

        if(root.left!=null)
            transverse(root.left);

        l(root.val);

        if(root.right!=null)
            transverse(root.right);



    }




}
