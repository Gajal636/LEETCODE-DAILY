class Solution {
    static int solve(int[] stoneValue, int index,int[]dp){
       if(index>=stoneValue.length){
        return 0;
       }if(dp[index]!=-1){
        return dp[index];
       }
       int sum=0;
       int ans=Integer.MIN_VALUE;
       for(int j=0;j<3 && index+j<stoneValue.length;j++){
         sum+=stoneValue[index+j];
         ans=Math.max(ans,sum-solve(stoneValue,index+j+1,dp));
       }
       dp[index]=ans;
       return dp[index];
    }
    public String stoneGameIII(int[] stoneValue) {
        int[]dp=new int[stoneValue.length];
        Arrays.fill(dp,-1);
       int finalAns=solve(stoneValue,0,dp);
       if(finalAns<0){
        return "Bob";
       }else if(finalAns>0){
        return "Alice";
       }else{
        return "Tie";
       }
    }
}