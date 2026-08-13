// https://leetcode.com/problems/house-robber-ii
class HouseRobberII {
    int[] dp;

    public int rob(int[] nums) {

        int end = nums.length;
        dp = new int[end];
        if (end == 1) {
            return nums[0];
        }

        Arrays.fill(dp, -1);
        int pickLast = enter(1, nums, end);

        Arrays.fill(dp, -1);
        int dontPickLast = enter(0, nums, end - 1);

        return Math.max(pickLast, dontPickLast);
    }

    int enter(int i, int[] nums, int end) {
        if (i >= end) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int pick = nums[i] + enter(i + 2, nums, end);
        int skip = enter(i + 1, nums, end);

        dp[i] = Math.max(pick, skip);

        return dp[i];
    }
}

/**

Always start filling from N-1 in redursion

0 1 2 3
1 2 3 1

dp
1 2   3


 */
