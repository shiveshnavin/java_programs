package in.shivesh;

import java.util.*;

/**
 * https://leetcode.com/explore/challenge/card/september-leetcoding-challenge-2021/636/week-1-september-1st-september-7th/3963/
 */
public class DistancesBetweenAllNodes {

    public static void main(String [] args) {
        DistancesBetweenAllNodes distancesBetweenAllNodes = new DistancesBetweenAllNodes();
        int[][]  edges  ={{0,1},{0,2},{2,3},{2,4},{2,5}};
        System.out.println(Arrays.toString(distancesBetweenAllNodes.sumOfDistancesInTree(edges.length,edges)));
    }

    private int[] sumOfDistancesInTree(int n, int[][] edges) {

       int result [] = new int[n];
        ArrayList<Integer>[] group = (ArrayList<Integer>[]) new ArrayList[n+1];

        int mpt [] = new int[n+1];

        for(int i=0;i<edges.length;i++){

            if(group[edges[i][0]]==null)
                group[edges[i][0]] = new ArrayList<>();
            if(group[edges[i][1]]==null)
                group[edges[i][1]] = new ArrayList<>();

            int from = edges[i][0];
            int to = edges[i][1];
            group[edges[i][0]].add(edges[i][1]);
            group[edges[i][1]].add(edges[i][0]);

            mpt[to] = from;
        }

        for(int i=0;i<group.length;i++){
            System.out.println(""+i+">"+group[i]);
        }

        System.out.println(Arrays.toString(mpt));

        for(int i=0;i<n;i++){
            Queue<Integer> q = new ArrayDeque<Integer>();
            q.add(i);
            while (!q.isEmpty()){
                int cur = q.remove();
                q.addAll(group[cur]);


            }
        }

        return null;
    }

}
