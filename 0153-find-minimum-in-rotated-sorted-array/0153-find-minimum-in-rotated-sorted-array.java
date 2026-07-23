class Solution {
    static int solve(int nums[]){
          int left=0;
        int right=nums.length-1;
        if(nums[left]<=nums[right]){
            return -1;
        }
        while(left<right){
            int mid=left+(right-left)/2;
         if(nums[mid]>nums[right]){
            left=mid+1;
         }  else{
            right=mid;
         }
      }
      return left-1;
    }
    
    public int findMin(int[] nums) {
      int pivot=solve(nums);
      if(pivot==-1){
        return nums[0];
      }
      return nums[pivot+1];
    }
}