package in.hoptec;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import in.hoptec.Graph.Pair;

public class GraphPrims {

   static int max = Integer.MAX_VALUE;

   static ArrayList<Pair> list [] =new ArrayList[6];

    public static void main(String[] args) {


        int index=0;
        list[index]=new ArrayList<>();
        list[index].add(new Pair(2,1));
        list[index].add(new Pair(111,2));

        index=1;
        list[index]=new ArrayList<>();
        list[index].add(new Pair(1,3));

        index=2;
        list[index]=new ArrayList<>();
        list[index].add(new Pair(2,5));

        index=3;
        list[index]=new ArrayList<>();
        list[index].add(new Pair(2,2));
        list[index].add(new Pair(3,4));

        index=4;
        list[index]=new ArrayList<>();

        index=5;
        list[index]=new ArrayList<>();

        prim(0);

    }

    public static void prim(int root){
        int visited [] =new int[list.length];
        Integer dist[] =new Integer[list.length];
        Integer parent[] =new Integer[list.length];

        Arrays.fill(dist, max);

        Queue<Integer> q=new LinkedList<>();
        q.add(root);
        dist[root]=0;


        while (!q.isEmpty()){
            root=q.remove();
            if(visited[root]==0)
            {
                for(Pair e:list[root]){
                    q.add(e.vertex);
                    int newDist = Math.min(dist[root]+e.weight,dist[e.vertex]);
                    dist[e.vertex]=newDist;
                    if(newDist == dist[root]+e.weight){
                        parent[e.vertex]=root;
                    }
                }
            }

        }

        System.out.print(" MST -> ");
        Print.print(parent);


        System.out.print(" Dist -> ");
        Print.print(dist);

    }

    public static void bfs(int root){

        int visited [] =new int[list.length];
        int level [] =new int[list.length];

        int lastLevel = 0;
        Queue<Integer> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            root=q.remove();
            if(visited[root]==0)
            {
                int curlevel=level[root];
                if(curlevel!=lastLevel){
                    System.out.println("\n");
                }
                lastLevel=curlevel;
                list[root].forEach(e->{
                    q.add(e.vertex);
                    level[e.vertex]=curlevel+1;
                });
                System.out.print(" "+root);
                visited[root]=1;
            }

        }

    }



}
