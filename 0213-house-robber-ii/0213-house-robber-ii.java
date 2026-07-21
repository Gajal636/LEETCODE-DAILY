class Solution {

    static int solve(int[] nums, int st,int end) {
         int[] dp = new int[nums.length-1];
       int n=nums.length;
        dp[0]=nums[st];
        dp[1]= Math.max(nums[st],nums[st+1]);
       
       for(int i=st+2,j=2 ;i<=end;i++,j++){
        dp[j]=Math.max(dp[j-1],dp[j-2]+nums[i]);
       }
       return dp[n-2];
    }

    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
       int n=nums.length;
       
        return Math.max(solve(nums, 0,n-2),
                        solve(nums, 1,n-1));
    }
}