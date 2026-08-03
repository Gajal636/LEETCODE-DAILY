class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int i=0;
        int maxGap=0;
        Arrays.sort(nums);
        for(int j=i+1;j<nums.length;j++){
          int gap=nums[j]-nums[i];
            if(gap>maxGap){
                maxGap=gap;
            }
                i++;
        }
        return maxGap;
    }
}