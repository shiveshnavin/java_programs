package in.hoptec;

/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.io.*;
import java.util.*;
public class CandidateCode {

    String added="";


    public Graph constructGraph(int noOfVertices, int noOfEdges)
    {

        Graph graph=null;

        int u, v;


        graph=new Graph(noOfVertices);
        l("Enter Connections -> ");
        for(int i=0;i<noOfEdges;i++)
        {

            u=nS[i][0];
            v=nS[i][1];
            if(!added.contains(getCode(u,v)))
            {
                graph.addEdge(u, v);
                graph.addEdge(v, u);
                added=added+getCode(u,v);
            }

        }

        return graph;
    }

    String getCode(int u,int v)
    {
        if(u>v)
        {
            return "-"+u+":"+v+"-";
        }
        else {
            return "-"+v+":"+u+"-";
        }
    }


    public static ArrayList<Integer> doBFSShortestPath(Graph graph, int source, int dest)
    {
        ArrayList<Integer> shortestPathList = new ArrayList<Integer>();
        HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();

        if (source == dest)
            return null;
        Queue<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> pathStack = new Stack<Integer>();

        queue.add(source);
        pathStack.add(source);
        visited.put(source, true);

        while(!queue.isEmpty())
        {
            int u = queue.poll();
            ArrayList<Integer> adjList = graph.getOutEdges(u);

            for(int v : adjList) {
                if(!visited.containsKey(v)) {
                    queue.add(v);
                    visited.put(v, true);
                    pathStack.add(v);
                    if(u == dest)
                        break;
                }
            }
        }

        int node, currentSrc=dest;
        shortestPathList.add(dest);
        while(!pathStack.isEmpty())
        {
            node = pathStack.pop();
            if(graph.isNeighbor(currentSrc, node))
            {
                shortestPathList.add(node);
                currentSrc = node;
                if(node == source)
                    break;
            }
        }

        return shortestPathList;
    }


    public void findShortestPath(int i)
    {

        Graph graph = city;
        int source = mS[i][0];
        int dest =mS[i][1];

        ArrayList<Integer> shortestPathList =  doBFSShortestPath(graph, source, dest);

        l("[ ");
        for(int node : shortestPathList)
        {
            House h=houses.get(node-1);
            l(node+"("+(++h.gifts)+") ");
            houses.set(node-1,h);
            if(h.gifts > max)
                max=h.gifts;
        }
        l("]");
    }


    public static class Graph{


        public static ArrayList<Integer>[] adjacencyList=null;
        public int noOfVertices;

        public Graph(int noOfVertices)
        {
            adjacencyList=(ArrayList<Integer>[])new ArrayList[noOfVertices+1];
            this.noOfVertices=noOfVertices;
            for(int i=0;i<(noOfVertices+1);i++)
                adjacencyList[i]=new ArrayList<Integer>();
        }

        public void addEdge(int u, int v)
        {
            if(adjacencyList[u]==null)
                adjacencyList[u]=new ArrayList<Integer>();
            adjacencyList[u].add(v);
        }


        public boolean isNeighbor(int u, int v)
        {
            if(adjacencyList[u]==null)
                return false;
            return adjacencyList[u].contains(v);

        }

        public ArrayList<Integer> getOutEdges(int u)
        {
            return adjacencyList[u];
        }


    }


    public static class House
    {
        int houseNo=0;
        int gifts=0;
        public House(int no)
        {
            houseNo=no;
        }

    }
    public static void l(String s)
    {
         System.out.println(s);
    }

    static int max=0;
    static Graph city;
    static ArrayList<House> houses;
    int N;
    int M;
    int nS[][];
    int mS[][];

    public void start()
    {

        houses=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            houses.add(new House(i));
        }

        city=constructGraph(N,N-1);


        l("Enter Visits -> ");
        for(int i=0;i<M;i++)
        {
            findShortestPath(i);
        }


        System.out.println(""+max);


    }


    public static void main(String args[] ) throws Exception {

        //Write code here/

        CandidateCode c=new CandidateCode();

    }


    public CandidateCode()
    {
        Scanner s=new Scanner(System.in);
        l("N -> ");
        N=s.nextInt();

        l("M -> ");
        M=s.nextInt();

        l("n - "+N+"\nm "+M);
        nS=new int[N-1][2];
        for(int i=0;i<N-1;i++)
        {
            nS[i][0]=s.nextInt();
            nS[i][1]=s.nextInt();
            l(">-"+nS[i][0]+","+nS[i][1]+"<-");
        }

        mS=new int[M][2];
        for(int i=0;i<M;i++)
        {
            mS[i][0]=s.nextInt();
            mS[i][1]=s.nextInt();
            l(">-"+mS[i][0]+","+mS[i][1]+"<-");
        }

           start();

    }


}
