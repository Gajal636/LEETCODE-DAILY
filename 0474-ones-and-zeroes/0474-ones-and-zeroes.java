class Solution {
    static int solve(String[] strs, int index, int m, int n, int[][][] dp) {
        if (index == strs.length)
            return 0;
        if (dp[index][m][n] != -1)
            return dp[index][m][n];
        int zeros = 0;
        int ones = 0;
        for (char ch : strs[index].toCharArray()) {
            if (ch == '0') {
                zeros++;
            } else {
                ones++;
            }
        }
        int include = 0;
        if (zeros <= m && ones <= n) {
            include = 1 + solve(strs, index + 1, m - zeros, n - ones, dp);
        }
        int exclude = solve(strs, index + 1, m, n, dp);
        dp[index][m][n] = Math.max(include, exclude);
        return dp[index][m][n];

    }

    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][][] = new int[strs.length][m + 1][n + 1];

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j <= m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return solve(strs, 0, m, n, dp);
    }
}