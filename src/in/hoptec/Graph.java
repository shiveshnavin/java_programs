package in.hoptec;

import java.util.LinkedList;
public  class Graph {

    public static class Pair{

        public int weight;
        public int vertex;

        public Pair(int weight, int vertex) {
            this.weight = weight;
            this.vertex = vertex;
        }

        @Override
        public boolean equals(Object obj) {
            Pair pr=(Pair)obj;
            return vertex==pr.vertex;
        }
    }

    public int N=10;

    public LinkedList<Pair>[] adj  = new LinkedList[N];


    //Graph from https://www.geeksforgeeks.org/graph-and-its-representations/

    public Graph()
    {

        for(int i=0;i<N;i++)
            adj[i]=new LinkedList<>();


        addEdge(1,0, 1);
        addEdge(1,0, 2);
        addEdge(1,1, 2);
        addEdge(1,2, 0);
        addEdge(1,2, 3);
        addEdge(1,3, 3);

    }
    public Graph(int SIZE)
    {
        N=SIZE;
        adj=new LinkedList[N];
        for(int i=0;i<N;i++)
            adj[i]=new LinkedList<>();
    }

    public Graph(int SIZE,boolean bidirectional)
    {
        N=SIZE;
        adj=new LinkedList[N];
        for(int i=0;i<N;i++)
            adj[i]=new LinkedList<>();
        this.bidirectional=bidirectional;
    }

    boolean bidirectional=false;

    public void addEdge(int weight,int from,int to)
    {

        if(from>N || to>N)
        {
            throw new IndexOutOfBoundsException("Graph size exceded , MAX="+N);
        }

       adj[from].add(new Pair(weight,to));
        if(bidirectional)
        {
            adj[to].add(new Pair(weight,from));
        }

    }

    public void deleteEdge(int from,int to)
    {
        Pair p=new Pair(1,to);
        adj[from].remove(p);
    }

    public void print()
    {
        for(int i=0;i<adj.length;i++)
        {
            if(adj[i].size()>0)
            {
                System.out.println("Adj List for "+i);

                for(Pair p:adj[i]){

                      System.out.print(""+p.vertex+"("+p.weight+") -> ");


                }
                System.out.println("");
            }
        }
    }






}
