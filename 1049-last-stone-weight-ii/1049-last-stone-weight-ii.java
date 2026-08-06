class Solution {
    static int solve(int[] stones,int w,int n,int dp[][]){
        if(w==0||n==0) return 0;
        if(dp[n][w]!=-1) return dp[n][w];
        if(stones[n-1]<=w){
        int include=stones[n-1]+solve(stones,w-stones[n-1],n-1,dp);
        int exclude=solve(stones,w,n-1,dp);
        dp[n][w]= Math.max(include,exclude);
        return dp[n][w];
        }else{
            return solve(stones,w,n-1,dp);
        }
    }
    public int lastStoneWeightII(int[] stones) {
        int n=stones.length;
        int sum=0;
        for(int stone:stones)
           sum+=stone;
        
        int w=sum/2;
        int dp[][]=new int [n+1][w+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int subsetSum= solve(stones,w,n,dp);
        return sum-2*subsetSum;
    }
}