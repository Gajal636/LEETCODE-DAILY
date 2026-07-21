class Solution {
    static int solve(int[]coins,int amount,int dp[]){
        if(amount==0){
            return 0;
        }if(amount<0){
            return Integer.MAX_VALUE;
        }if(dp[amount]!=-1){
            return dp[amount];
        }

        int mini=Integer.MAX_VALUE;
        for(int coin:coins){
            int recAns=solve(coins,amount-coin,dp);
            if(recAns!=Integer.MAX_VALUE){
                int totalAns=recAns+1;
                mini=Math.min(totalAns,mini);
            }
        }
        dp[amount]=mini;
        return dp[amount];
    }
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=solve(coins,amount,dp);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }else{
            return ans;
        }
    }
}