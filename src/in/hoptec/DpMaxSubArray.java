package in.hoptec;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-subarray
public class DpMaxSubArray {

    /*

   [5,4,-1,7,8]
   maxL 0 0
   maxS 0 9
   maxR 0 1

   curR = 4


   [-2,1,-3,4,-1,2,1,-5,4]
   [-2,-1,-4,0,-1,1,2,-3,1]

   */

    public static void main(String[] args) {
         maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) ; // should be 6
        maxSubArray(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}) ; // should be 7
    }

    public static int maxSubArray(int[] arr) {

        int n = arr.length;
        int sr[] = new int[n];
        sr[0] = arr[0];
        for(int i=1;i<n;i++){
            sr[i] = Math.max(arr[i] + sr[i-1],arr[i]);
        }

        int maxL = 0;
        int maxR = n-1;
        for(int i=n-2;i>=0;i--){
            if(sr[i] > sr[maxR]){
                maxR = i;
            }
            if(sr[i]<=0){
                maxL = i + 1;
            }
        }
        System.out.println("Max >>" +sr[maxR]+" when u add ["+maxL+"] to ["+maxR+"]" );

        return sr[maxR];
    }

}
