package in.shivesh;

// https://leetcode.com/problems/min-cost-climbing-stairs/

class DPStaircase {
    int [] cache;
    
    public int minCostClimbingStairs(int[] cost) {
        int dp2 = 0;
        int dp1 = 0;

        for(int i=2;i<=cost.length;i++){
            int current = Math.min(
                dp2 + cost[i-2],
                dp1 + cost[i-1]
            );
            dp2 = dp1;
            dp1 = current;
        }

        return dp1;
    }


    public int minCostClimbingStairs_CACHE(int[] cost) {
        cache = new int[cost.length];
        Arrays.fill(cache,-1);
        return Math.min(check(0,cost),check(1,cost));
    }

    int check(int pos,int[] cost){
        if(pos>cost.length){
            return Integer.MAX_VALUE;
        }
        if(pos == cost.length){
            return 0;
        }
        if(cache[pos] != -1){
            return cache[pos];
        }

        int oneStep = check(pos+1, cost);
        int twoStep = check(pos+2, cost);

        cache[pos] = cost[pos] +  Math.min(oneStep, twoStep);
        return cache[pos];

    }

}
 
