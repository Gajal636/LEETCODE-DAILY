class Solution {
    public int solve(String s,String t,int i,int j,int dp[][]){
        if(j==t.length()) return 1;
        if(i==s.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
       
            if(s.charAt(i)==t.charAt(j)){
                ans=solve(s,t,i+1,j+1,dp)+ solve(s,t,i+1,j,dp);
            }else{
                ans=solve(s,t,i+1,j,dp);
            }

        return dp[i][j]=ans;
    }
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()][t.length()];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return solve(s,t,0,0,dp);
    }
}