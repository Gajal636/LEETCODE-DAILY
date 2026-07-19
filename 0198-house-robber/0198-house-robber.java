class Solution {
    static int sum(int[]nums, int[]dp,int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        dp[i]=Math.max((nums[i]+sum(nums,dp,i+2)),sum(nums,dp,i+1));
        return dp[i];
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return sum(nums,dp,0);
    }
}