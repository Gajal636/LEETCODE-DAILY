class Solution {
    static int solve(List<List<Integer>> triangle, int i, int j, int[][] dp) {
        if (i == triangle.size() - 1) {
            return triangle.get(i).get(j);

        }
        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }
        int mini = Integer.MAX_VALUE;
        int ans1 = triangle.get(i).get(j) + solve(triangle, i + 1, j, dp);
        int ans2 = triangle.get(i).get(j) + solve(triangle, i + 1, j + 1, dp);
        mini = Math.min(ans1, ans2);
        dp[i][j] = mini;
        return dp[i][j];

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        return solve(triangle, 0, 0, dp);
    }
}