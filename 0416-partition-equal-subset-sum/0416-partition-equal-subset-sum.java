class Solution {
    static Boolean[][]dp;
    static boolean solve(int[]nums, int target ,int index){
        if(target==0){
            return true;
        }if(target<1){
            return false;
        }if(index>=nums.length){
            return  false;
        }if(dp[index][target] != null){
            return dp[index][target];
        }
        boolean include=solve(nums,target-nums[index],index+1);
        boolean exclude=solve(nums,target,index+1);

        dp[index][target]= include||exclude;
        return dp[index][target];
    }
    public boolean canPartition(int[] nums) {

      
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if((sum & 1)==1){
            return false;
        }
        int target=sum/2;
        int index=0;
       dp = new Boolean[nums.length][target + 1];
        boolean ans=solve(nums,target,index);
        return ans;
    }
}