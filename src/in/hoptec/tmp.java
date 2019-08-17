package in.hoptec;

import java.util.*;
import java.util.Stack;
import java.util.function.Consumer;

public class  tmp {



    public static void process(String n)
    {
        n.replace(" ","__");
    }

    static final ArrayList<Node>[] adjList = new ArrayList[5];
    public static void main(String [] args)
    {

        Stack<Integer> i=new Stack<>();
        i.empty();

        HashMap<Node,Boolean> h=new HashMap<>();
        Map<Node,Boolean> b=new HashMap<>();

        Set<Node> s=new HashSet<>();
        Node n=new Node(2);
        Node n2=new Node(2);
        h.put(n,true);
        h.put(n2,false);

        h.values().stream().forEach(new Consumer<Boolean>() {
            @Override
            public void accept(Boolean aBoolean) {

                System.out.println(""+aBoolean);

            }
        });

        adjList[4]=new ArrayList<Node>();
        adjList[4].add(new Node(2));


    }


}
