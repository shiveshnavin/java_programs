package in.hoptec;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class GraphDepthFirstSearch {


    public LinkedList<Graph.Pair>[] adj()
    {
        return bfs.adj;
    }
    public GraphDepthFirstSearch(Graph bfs) {
        this.bfs = bfs;
        visited=new boolean[adj().length];
    }

    public Graph bfs ;
    boolean visited[];


    public void transverse(int node)
    {

            visited[node]=true;
            Iterator<Graph.Pair> it=adj()[node].iterator();
        System.out.print(" "+node);

            while(it.hasNext())
            {
                int n=it.next().vertex;
                    if(!visited[n]) {
                    transverse(n);
                 }
            }


    }

    public static void main(String [] args)
    {
        Graph bfs=new Graph(10);

        bfs.addEdge(1,0, 1) ;
        bfs.addEdge(1,0, 2) ;
        bfs.addEdge(1,0, 3) ;
        bfs.addEdge(1,2, 4) ;
        bfs.addEdge(1,4, 5) ;
        bfs.addEdge(1,4, 6) ;
        bfs.addEdge(1,4, 7) ;
        bfs.addEdge(1,6, 8) ;/*
        bfs.addEdge(1,7, 3) ;
        bfs.addEdge(1,8, 7) ;*/

        bfs.print();


        GraphDepthFirstSearch g=new GraphDepthFirstSearch(bfs);
        g.transverse(0);


    }

}
