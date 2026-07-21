class Solution {
    static int solve(int points[],int dp[],int i){
        if(i>=points.length){
            return 0;
        }if(dp[i]!=-1){
            return dp[i];
        }
        int include=points[i]+solve(points,dp,i+2);
        int exclude=solve(points,dp,i+1);
        dp[i]=Math.max(include,exclude);
        return dp[i];
    }
    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }

        int points[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            points[nums[i]]+=nums[i];
        }

        int dp[]=new int[max+1];
        Arrays.fill(dp,-1);
        return solve(points,dp,0);
    }
}