class Solution {
    public int findPeakElement(int[] nums) {
     int left=1;
     int right=nums.length-1;

     while(left<=right){
        int mid=left+(right-left)/2;
        if(mid <nums.length-1 && mid>0 && nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
            return mid;
        }
        if(mid==0 && nums[mid]>nums[mid+1]){
            return mid;
        }
        if(mid==nums.length-1 && nums[mid]>nums[mid-1]){
            return mid;
        }
        else if(mid <nums.length && mid>0 && nums[mid]>nums[mid-1]){
            left=mid+1;
        }else{
            right=mid-1;
        }
     }   
     return 0;
    }
}