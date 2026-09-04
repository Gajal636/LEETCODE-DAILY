class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
        int max=Integer.MIN_VALUE;
        while(i<nums.length && j< nums.length){
            int mul=(nums[i]-1) * (nums[j]-1);
            if(mul>max){
                max=mul;
            }
            i++;
            j++;
        }
        return max;
    }
}