class Solution {
  static int findPivot(int[] nums) {
    int left = 0, right = nums.length - 1;

    if (nums[left] <= nums[right])
        return -1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] > nums[right])
            left = mid + 1;
        else
            right = mid;
    }

    return left - 1;
}

    static int binarySearch(int nums[], int target, int left,int right){
        // left=0;
        // right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        // int binarySearch=binarySearch(nums,left,right,target);
        int n=nums.length;
        
        if(pivot==-1){
            int ans=binarySearch(nums, target,0, n-1);
            return ans;
        }

        else{

            int startIndex1=0;
            int lastIndex=pivot;
            if(target<=nums[lastIndex] && target>=nums[startIndex1]){
               int ans= binarySearch(nums, target, startIndex1,lastIndex);
               return ans;
            }


            int startIndex2=pivot+1;
            int lastIndex2=n-1;
             if(target<=nums[lastIndex2] && target>=nums[startIndex2]){
                int ans=binarySearch(nums, target, startIndex2,lastIndex2);
                return ans;
            }

        }
        return -1;
    }

}