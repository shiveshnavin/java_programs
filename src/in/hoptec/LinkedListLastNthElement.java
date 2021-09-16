package in.hoptec;

public class LinkedListLastNthElement {

    public static void main(String[] args) {
        Node n = Node.sample();
        n.print();
        printNth(n,3);
    }

    public static int printNth(Node n,int nth){
        if(n.next == null){
            return 1;
        }
        int x = 1 + printNth(n.next,nth);
        if(x==nth){
            System.out.println(n.val);
        }
        return x;
    }

}
