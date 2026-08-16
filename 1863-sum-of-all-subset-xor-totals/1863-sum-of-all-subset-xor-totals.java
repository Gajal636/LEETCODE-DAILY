class Solution {
    static void solve(int nums[],int index,List<List<Integer>> ans,List<Integer> output){
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
       int curr=nums[index];
      output.add(curr);
      solve(nums,index+1,ans,output);
       
       output.remove(output.size()-1);

       solve(nums,index+1,ans,output);
        
    }
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(nums,index,ans,output);
        int max=0;
        for(int i=0;i<ans.size();i++){
            int xor=0;
            for(int j=0;j<ans.get(i).size();j++){
                xor^=ans.get(i).get(j);
            }
            max+=xor;
        }
        return max;
    }
}