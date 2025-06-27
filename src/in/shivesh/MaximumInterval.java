package in.shivesh;

import java.util.Scanner;

// https://www.hackerearth.com/problem/algorithm/find-the-point-where-maximum-intervals-overlap/
public class MaximumInterval {

    public static void main(String[] args) throws Exception {
        //Scanner
//        Scanner s = new Scanner(System.in);
//        Integer n = s.nextInt();
//
//        int[] arv = new int[n];
//        int[] dep = new int[n];
//        int maxInterval = 0;
//        for (int i = 0; i < n; i++) {
//            arv[i] = s.nextInt();
//        }
//
//        for (int i = 0; i < n; i++) {
//            dep[i] = s.nextInt();
//            if (dep[i] > maxInterval)
//                maxInterval = dep[i];
//        }

        System.out.println(solve(new int[]{1 ,2 ,9 ,5 ,5}, new int[]{4 ,5 ,12 ,9 ,12}, 12));
    }

    public static int solve(int[] arv, int[] dep, int maxInterval) {
        int n = arv.length;
        int[] g = new int[maxInterval];
        int maxGuests = 0;
        int maxTime = 0;
        int maxG = 0;
        for (int i = 0; i < n; i++) {
            int ar = arv[i];
            int de = dep[i];
            // System.out.println(ar+"-"+de+">"+g.length);
            for (int j = ar - 1; j < de; j++) {
                g[j] = g[j] + 1;
                if (maxGuests < g[j]) {
                    maxGuests = g[j];
                    maxTime = j;
                }
            }

        }
        //System.out.println(Arrays.toString(g));

        return maxTime + 1;
    }


}
