class Solution {
    static int solve(int[] nums, int index,int[] dp) {
        if (index >= nums.length - 1) {
            return 0;
        }if(dp[index]!=-1){
            return dp[index];
        }
        int mini = Integer.MAX_VALUE;
        // int jump = nums[index];
        // int Ans=0;
        for (int i = 1; i <= nums[index]; i++) {
            int temp = solve(nums, index+i,dp);
            if (temp != Integer.MAX_VALUE){
                mini = Math.min(mini, temp + 1);
            }
        }
        dp[index]=mini;
      return dp[index];
    }

    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums, 0,dp);
    }
}