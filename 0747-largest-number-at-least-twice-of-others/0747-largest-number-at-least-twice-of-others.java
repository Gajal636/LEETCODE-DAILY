class Solution {
    public int dominantIndex(int[] nums) {
        // Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        for(int i=0;i<nums.length;i++){
         
          if(i!=max && nums[max]<2*nums[i]){
            return -1;
          }

        }
        return max;
    }
}