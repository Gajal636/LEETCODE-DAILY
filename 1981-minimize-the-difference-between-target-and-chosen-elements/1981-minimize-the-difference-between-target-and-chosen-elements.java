class Solution {
    static int solve(int sum,int target,int [][]mat,int row,int dp[][]){
        if(row>=mat.length){
            return Math.abs(target-sum);
        }
        if(dp[row][sum]!=-1){
            return dp[row][sum];
        }
        int mini=Integer.MAX_VALUE;
        for(int num:mat[row]){
           int ans=solve(sum+num,target,mat,row+1,dp);
            mini=Math.min(mini,ans);
        }
        dp[row][sum]=mini;
        return dp[row][sum];
    }
    public int minimizeTheDifference(int[][] mat, int target) {
        int maxSum=mat.length*70;
        int[][] dp=new int[mat.length][maxSum+1];
        for(int []rows:dp){
            Arrays.fill(rows,-1);
        }
        return solve(0,target,mat,0,dp);
    }
}