package in.shivesh;

// https://leetcode.com/problems/longest-common-subsequence/
class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int larger = Math.max(n, m);
        int dp[][] = new int[n + 1][m + 1];

        Arrays.fill(dp[0], 0);
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int l1 = 1; l1 <= n; l1++) {
            for (int l2 = 1; l2 <= m; l2++) {
                
                if(text1.charAt(l1 - 1) == text2.charAt(l2 - 1 )){
                    dp[l1][l2] = 1 + dp[l1-1][l2-1];
                }
                else{
                     dp[l1][l2] = Math.max(
                        dp[l1-1][l2],
                        dp[l1][l2-1]
                     );
                }

            }
        }

        return dp[n][m];

    }
}
