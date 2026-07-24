class Solution {
    static int solve(int cost[],int i,int dp[]){
        if(i==0 || i==1){
            return 0;
        }
        if(i>cost.length){
            return 0;
        }if(dp[i] != -1){
    return dp[i];
}
        int firstJump=solve(cost,i-1,dp)+cost[i-1];
        int secondJump=solve(cost,i-2,dp)+cost[i-2];

        dp[i]=Math.min(firstJump,secondJump);
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[]dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return solve(cost,cost.length,dp);
    }
}