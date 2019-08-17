package in.hoptec;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphDijKastra {


    public LinkedList<Graph.Pair>[] adj()
    {
        return bfs.adj;
    }
    public GraphDijKastra(Graph bfs) {
        this.bfs = bfs;
        visited=new boolean[adj().length];
    }

    public Graph bfs ;
    boolean visited[];
    int [] preds;


    public void shortestPath(int root)
    {
        int dist[]=new int[adj().length];
        preds=new int[dist.length];
        for(int i=0;i<dist.length;i++) {
            dist[i] = Integer.MAX_VALUE;
            preds[i] = -1;
        }

        Queue<Integer> q=new LinkedList<>();
        q.add(root);
        dist[root]=0;


        while(!q.isEmpty())
        {
            int ele=q.remove();

            if(!visited[ele]) {
                visited[ele] = true;
                Iterator<Graph.Pair> it = adj()[ele].listIterator();
                while (it.hasNext()) {
                    Graph.Pair n = it.next();

                    dist[n.vertex] = Math.min(dist[n.vertex], dist[ele] + n.weight);
                        if(dist[n.vertex]<dist[ele]+n.weight)
                        {

                        }
                        else{
                            preds[n.vertex]=ele;
                        }
                    q.add(n.vertex);


                }
            }

        }


        for(int j=0;j<dist.length;j++)
        {
            if(dist[j]<Integer.MAX_VALUE)
              System.out.println("Dist from : "+j+" is "+dist[j]);
        }


        int to=7;

        if(preds[to]!=-1)
        {
            System.out.println("We can to "+to+" through "+preds[to]+" at cost "+dist[to]);
        }
        else{
            System.out.println("No path to "+to+" found");
            return;
        }

        int crawlUp=to;
        while(crawlUp!=-1)
        {
            System.out.print(""+crawlUp+" : ");
            crawlUp=preds[crawlUp];
        }

    }

    public static void main(String [] args)
    {
        Graph bfs=new Graph(13);
        bfs.addEdge(1,9, 1) ;
        bfs.addEdge(1,9, 2) ;
        bfs.addEdge(1,9, 3) ;
        bfs.addEdge(11,1, 4) ;
        bfs.addEdge(1,2, 4) ;
        bfs.addEdge(1,4, 5) ;
        bfs.addEdge(1,4, 6) ;
        bfs.addEdge(1,4, 7) ;
        bfs.addEdge(1,6, 8) ;
        bfs.addEdge(11,3, 7) ;

        GraphDijKastra d=new GraphDijKastra(bfs);
        d.shortestPath(4);
    }
}
