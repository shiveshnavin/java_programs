package in.hoptec;


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass2 {



    public static class Graph {
        HashMap<String,Integer> citiesMap;
        ArrayList<EdgeFl> edges;
        // No. of vertices in graph
        private int v;

        // adjacency list
        private ArrayList<Integer>[] adjList;

        //Constructor
        public Graph(int vertices){

            //initialise vertex count
            this.v = vertices;

            // initialise adjacency list
            initAdjList();
        }

        // utility method to initialise
        // adjacency list
        @SuppressWarnings("unchecked")
        private void initAdjList()
        {
            adjList = new ArrayList[v];

            for(int i = 0; i < v; i++)
            {
                adjList[i] = new ArrayList<>();
            }
        }

        // add edge from u to v
        public void addEdge(int u, int v)
        {
            // Add v to u's list.
            adjList[u].add(v);
        }

        // Prints all paths from
        // 's' to 'd'
        public void printAllPaths(int s, int d)
        {
            boolean[] isVisited = new boolean[v];
            ArrayList<Integer> pathList = new ArrayList<>();

            //add source to path[]
            pathList.add(s);

            //Call recursive utility
            printAllPathsUtil(s, d, isVisited, pathList);
        }

        // A recursive function to print
        // all paths from 'u' to 'd'.
        // isVisited[] keeps track of
        // vertices in current path.
        // localPathList<> stores actual
        // vertices in the current path
        List<FlightPath> listedPath=new ArrayList<>();
        private void printAllPathsUtil(Integer u, Integer d,
                                       boolean[] isVisited,
                                       ArrayList<Integer> localPathList) {

            // Mark the current node
            isVisited[u] = true;

            if (u.equals(d))
            {
                //System.out.println(localPathList);
                FlightPath p=new FlightPath();

                int prev=-1;
                for(int i=0;i<localPathList.size();i++)
                {
                    int no=localPathList.get(i);

                    p.list+=" "+getKeyByValue(citiesMap,no);

                    if(prev!=-1)
                    for(int j=0;j<edges.size();j++)
                    {
                        EdgeFl g=edges.get(j);
                        if(g.toString().equals(prev+"->"+no))
                        {
                            p.price+=g.price;
                            break;
                        }
                    }
                    prev=no;
                }

                listedPath.add(p);
            }

            // Recur for all the vertices
            // adjacent to current vertex
            for (Integer i : adjList[u])
            {
                if (!isVisited[i])
                {
                    // store current node
                    // in path[]
                    localPathList.add(i);
                    printAllPathsUtil(i, d, isVisited, localPathList);

                    // remove current node
                    // in path[]
                    localPathList.remove(i);
                }
            }

            // Mark the current node
            isVisited[u] = false;
        }

    }
    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    public static void lg(String s)
    {
        //System.out.println(s);
    }

    public TestClass2()
    {
        nodes=new ArrayList<>();
    }

    public static class FlightPath{
        String list="";
        int price=0;

        public String toString()
        {
            return list+" "+price;
        }
    }
    public static class EdgeFl {

        int citySrc;
        int cityDest;
        int price;

        public EdgeFl(int cS, int cD, int p)
        {
            citySrc=cS;
            cityDest=cD;
            price=p;
        }
        public String toString()
        {
            return citySrc+"->"+cityDest;
        }

    }


    ArrayList<EdgeFl> nodes;
    String source,dest;
    HashMap<String,Integer> citiesMap =new HashMap<>();


    public void start()
    {

        lg("From : "+source+" : "+citiesMap.get(source));
        lg("To : "+dest+" : "+citiesMap.get(dest));

        int s = citiesMap.get(source);
        int d = citiesMap.get(dest);


        lg("nodes "+nodes.size());
        Graph g = new Graph(nodes.size());
        g.citiesMap=citiesMap;
        g.edges=nodes;

        nodes.forEach((node) ->{

            lg(node.citySrc+" to "+node.cityDest+" = "+node.price);
            g.addEdge(node.citySrc,node.cityDest);
        });




        g.printAllPaths(s, d);
        g.listedPath.sort(new Comparator<FlightPath>() {
            @Override
            public int compare(FlightPath o2, FlightPath o1) {

                if(o1.price > o2.price)
                    return -1;
                if(o1.price<o2.price)
                    return 1;


                int count1=0;
                for (int i = 0; i < o1.list.length(); i++) {
                    if (o1.list.charAt(i) == ' ') {
                        count1++;
                    }
                }
                int count2=0;
                for (int i = 0; i < o2.list.length(); i++) {
                    if (o2.list.charAt(i) == ' ') {
                        count2++;
                    }
                }

                if(count1 > count2)
                    return -1;
                if(count1<o2.price)
                    return 1;
                else
                    return 0;

            }
        });
        lg(g.listedPath.toString());
        if(g.listedPath.isEmpty())
        {
            System.out.println("No Flights");
        }
        g.listedPath.stream().forEach((fp) ->
        {
            System.out.println(fp.toString().trim());

        });

    }




    public static void main(String args[] ) throws Exception {


        String text="Delhi Bangalore\n" +
                "Bangalore Hyderabad 10000\n" +
                "Bangalore Delhi 2000\n" +
                "Delhi Mumbai 1000\n" +
                "Mumbai Hyderabad 1000\n" +
                "Bangalore Chennai 4000\n" +
                "Chennai Hyderabad 4000";

       // System.out.println(text);
        try (PrintStream out = new PrintStream(new FileOutputStream("input.txt"))) {
            out.print(text);
        }


       TestClass2 t=new TestClass2();

        Scanner stdin = new Scanner(new FileInputStream("input.txt"));
        int pos=0;
        int i=0;
        while (stdin.hasNext()) {
           String line=stdin.nextLine();
           String data[] = line.split(" ");
           if(pos==0)
           {
               t.source=data[0];
               t.dest=data[1];
           }
           else {

               if(!t.citiesMap.containsKey(data[0]))
               {
                   t.citiesMap.put(data[0],i++);

               }
               if(!t.citiesMap.containsKey(data[1]))
               {
                   t.citiesMap.put(data[1],i++);

               }


               t.nodes.add(new EdgeFl(t.citiesMap.get(data[0]),t.citiesMap.get(data[1]),Integer.valueOf(data[2])));


           }
           pos++;
        }

        t.start();

    }





    static class Vertex implements Comparable<Vertex>
    {
        public final String name;
        public Edge[] adjacencies;
        public double minDistance = Double.POSITIVE_INFINITY;
        public Vertex previous;
        public Vertex(String argName) { name = argName; }
        public String toString() { return name; }
        public int compareTo(Vertex other)
        {
            return Double.compare(minDistance, other.minDistance);
        }

    }


    static class Edge
    {
        public final Vertex target;
        public final double weight;
        public Edge(Vertex argTarget, double argWeight)
        { target = argTarget; weight = argWeight; }
    }

    public static void computePaths(Vertex source)
    {
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
        vertexQueue.add(source);

        while (!vertexQueue.isEmpty()) {
            Vertex u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adjacencies)
            {
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
                if (distanceThroughU < v.minDistance) {
                    vertexQueue.remove(v);

                    v.minDistance = distanceThroughU ;
                    v.previous = u;
                    vertexQueue.add(v);
                }
            }
        }
    }

    public static List<Vertex> getShortestPathTo(Vertex target)
    {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);

        Collections.reverse(path);
        return path;
    }







}

