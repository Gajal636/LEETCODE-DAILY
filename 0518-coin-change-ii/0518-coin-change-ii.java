class Solution {
    static int solve(int amount, int[] coins,int i,int dp[][]){
        if(amount==0){
            return 1;
        }if(amount<0||i>=coins.length){
            return 0;
        }if(dp[amount][i]!=-1){
            return dp[amount][i];
        }
        int include=solve(amount-coins[i],coins,i,dp);
        int exclude=solve(amount,coins,i+1,dp);
        dp[amount][i]= include+exclude;
        return dp[amount][i];
    }
    public int change(int amount, int[] coins) {
        int dp[][]=new int[amount+1][coins.length];
          for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(amount,coins,0,dp);
    }
}