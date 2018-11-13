package in.hoptec;

/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CandidateCodeScanner {



    public static Graph constructGraph(int noOfVertices,int noOfEdges)
    {

        Graph graph=null;

        int u, v;
        Scanner scanner=new Scanner(System.in);

        graph=new Graph(noOfVertices);
        l("Enter Connections -> ");
        for(int i=0;i<noOfEdges;i++)
        {

            u=scanner.nextInt();
            v=scanner.nextInt();
            graph.addEdge(u, v);
            graph.addEdge(v, u);
        }

        return graph;
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


    public static void findShortestPath()
    {

        Graph graph = city;
        Scanner scanner = new Scanner(System.in);
        int source = scanner.nextInt();
        int dest = scanner.nextInt();

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
        // System.out.println(s);
    }

    static int max=0;
    static Graph city;
    static ArrayList<House> houses;
    public CandidateCodeScanner()
    {

        Scanner s=new Scanner(System.in);
        l("N -> ");
        int N=s.nextInt();

        l("M -> ");
        int M=s.nextInt();

        houses=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            houses.add(new House(i));
        }

        city=constructGraph(N,N-1);


        l("Enter Visits -> ");
        for(int i=0;i<M;i++)
        {
            findShortestPath();
        }


        System.out.println(""+max);


    }

    int [] readInt()
    {
        int [] a=new int[2];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  lines = null;
        try {
            lines = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] strs = lines.trim().split("\\s+");

        for (int i = 0; i < strs.length; i++) {
            a[i] = Integer.parseInt(strs[i]);
        }

        return a;
    }


    public static void main(String args[] ) throws Exception {

        //Write code here/
        CandidateCodeScanner c=new CandidateCodeScanner();

    }
}
