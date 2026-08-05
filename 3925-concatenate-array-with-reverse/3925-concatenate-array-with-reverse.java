class Solution {
    static int[] reverse(int nums[]){
        int[]rev=new int[nums.length];
        int index=0;
        for(int i=nums.length-1;i>=0;i--){
         rev[index++]=nums[i];
        }
      
      return rev;
    }
    public int[] concatWithReverse(int[] nums) {
        int rev[]=reverse(nums);
        int ans[]=new int[2*(nums.length)];

        int index=0;
        for(int num:nums){
            ans[index++]=num;
        }
        for(int num:rev){
            ans[index++]=num;
        }
      return ans;
    }
}