package in.hoptec;

import java.util.Scanner;

// https://www.hackerearth.com/problem/algorithm/subarray-with-given-sum-5/
// https://www.geeksforgeeks.org/find-subarray-with-given-sum/
public class DpSumSubArray {

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
//        Integer t = s.nextInt();

//        while(t-->0){
//
//            Integer n = s.nextInt();
//            long sum = s.nextLong();
//            long[] arv = new long[n];
//            for (int i = 0; i < n; i++) {
//                arv[i] = s.nextLong();
//            }
//
//            int [] r = solve(arv,sum);
//            if(r!=null){
//                System.out.println(r[0]+" "+r[1]);
//            }
//            else
//            {
//                System.out.println(-1);
//            }
//        }

        int [] res = solve(new long[]{ 15, 2, 4, 8, 9, 5, 10, 23 },23);
        if(res==null){
            System.out.println(-1);
        }
        else
        System.out.println(res[0]+" "+res[1]);
    }



    public static int[] solve(long [] ar,long sum){
        int res [] = null;

        int n = ar.length;
        long [] sr  = new long[n];
        int left = 0;
        long csum = ar[left];
        sr[left] = csum;

        for(int i=1;i<n;i++){


            sr[i] = sr[i-1] + ar[i];
            csum = sr[i];


            while(csum > sum && left < i-1){
                csum = csum - ar[left++];
                sr[i] = csum;
            }

            if(csum == sum){
                res = new int[]{left,i};
                return res;
            }
            // System.out.println(Arrays.toString(sr));
        }


        return res;
    }
}
