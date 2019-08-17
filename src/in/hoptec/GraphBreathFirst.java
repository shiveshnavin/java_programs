package in.hoptec;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBreathFirst {


    public GraphBreathFirst(Graph bfs) {
        this.bfs = bfs;
    }

    public Graph bfs ;
    public LinkedList<Graph.Pair>[] adj()
    {
        return bfs.adj;
    }

    public void transverse() {

        int homeVertex=0;
        boolean visited[]=new boolean[adj().length];
        Queue<Integer> nodes=new LinkedList<>();
        nodes.add(homeVertex);

        while (!nodes.isEmpty()){

            int ele=nodes.poll();
            if(!visited[ele])
            {
                visited[ele]=true;

                System.out.print(" "+ele);

                for (Graph.Pair p:adj()[ele])
                {
                    nodes.add(p.vertex);
                }

            }

        }


        System.out.println("");

    }

    public void findLevelOfVertex(int v)
    {
        int homeVertex=0;
        boolean visited[]=new boolean[adj().length];
        Queue<Integer> nodes=new LinkedList<>();
        nodes.add(homeVertex);

        int levelSizes[] = new int[adj().length];

        int curLevel=0;
        int nodeOfElementsLest=nodes.size();

        while (!nodes.isEmpty()){

            int ele=nodes.remove();

            if(!visited[ele])
            {


                visited[ele]=true;

                if(nodeOfElementsLest==0)
                {

                    System.out.println("   level  "+(curLevel )+" had width="+levelSizes[curLevel]);
                    curLevel++;
                    nodeOfElementsLest=nodes.size();
                    System.out.println(" Going to next level "+curLevel);
                }
                else
                {
                    nodeOfElementsLest--;
                }
                levelSizes[curLevel]++;

                System.out.print(" "+ele);
                for (Graph.Pair p:adj()[ele])
                {


                    nodes.add(p.vertex);


                }

            }



        }

        System.out.println("FOUUUUUUUUUUUUD no of nodes="+levelSizes[v] );
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
        bfs.addEdge(1,6, 8) ;
        bfs.addEdge(1,7, 3) ;
        bfs.addEdge(1,8, 7) ;


        /*
        bfs.addEdge(1,40,10);
        bfs.addEdge(1,40,20);
        bfs.addEdge(1,10,30);
        bfs.addEdge(1,20,30);
        bfs.addEdge(1,20,60);
        bfs.addEdge(1,20,50);
        bfs.addEdge(1,30,60);
        bfs.addEdge(1,60,70);
        bfs.addEdge(1,50,70);
        */

        GraphBreathFirst gp=new GraphBreathFirst(bfs);
        gp.transverse();
        gp.findLevelOfVertex(3);



    }
}
