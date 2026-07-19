class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        int sum=0;
        int n=nums.length;
      Arrays.sort(nums);
      for(int i=0;i<n-2;i++){
        int left = i+1;
        int right=n-1;

        while(left<right){
            sum=nums[i]+nums[left]+nums[right];
            if(sum==0){
                List<Integer> temp=new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[left]);
                temp.add(nums[right]);
               
                result.add(temp);
                left++;
                right--;
            }else if(sum<0){
                left++;
            }else{
                right--;
            }
        }
      }
      return new ArrayList<>(result);
    }
}