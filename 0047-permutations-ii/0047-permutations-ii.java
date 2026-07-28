class Solution {
    static void solve(int [] nums, List<Integer> output,List<List<Integer>> ans){
        if(nums.length==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        HashSet<Integer> used = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(used.contains(nums[i])){
                continue;
            }
            used.add(nums[i]);
            output.add(nums[i]);

            int[] remArr=new int[nums.length-1];
            int k=0;

            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    remArr[k++]=nums[j];
                }
            }
            solve(remArr,output,ans);
            output.remove(output.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        solve(nums,new ArrayList<>(),ans);
        return ans;
    }
}