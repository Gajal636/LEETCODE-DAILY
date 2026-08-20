class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=0;
        int maxSum=0;
        for(int i=0; i<nums.length; i++){
            if(i+1< nums.length && nums[i]<nums[i+1]){
                sum+=nums[i];
            }else{
                sum+=nums[i];
                maxSum=Math.max(sum, maxSum);

                sum=0;
            }
        }
        return maxSum;
    }
}