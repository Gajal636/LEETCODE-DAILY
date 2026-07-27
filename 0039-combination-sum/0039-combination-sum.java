class Solution {
    static void solve(int[]candidates,int target,int index,List<List<Integer>> ans,List<Integer> output){
        if(target==0){
            ans.add(new ArrayList(output));
             return ;
        }
       if(index>=candidates.length || target<0){
        return ;
       }
       int curr=candidates[index];
       output.add(curr);
       solve(candidates,target-curr,index,ans,output);
       output.remove(output.size()-1);
       solve(candidates,target,index+1,ans,output);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(candidates,target,index,ans,output);
        return ans;

    }
}