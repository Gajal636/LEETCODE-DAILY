class Solution {
    static boolean solve(int nums[],int i,Boolean[]dp){
        if(i==nums.length-1){
            return true;
        }if(i>=nums.length){
            return false;
        }if(nums[i]==0){
            return false;
        }if(dp[i]!=null){
            return dp[i];
        }
        int jumpVal=nums[i];
     
        for(int jump=1;jump<=jumpVal;jump++){
           if(solve(nums,i+jump,dp)){
            return dp[i]=true;
           }
        }
     
        return dp[i]=false;
    }
    public boolean canJump(int[] nums) {
        Boolean[] dp=new Boolean[nums.length];
      
        return solve(nums,0,dp);
    }
}