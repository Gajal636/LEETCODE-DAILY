class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int left=0;
        int right=nums.length-1;
        // int ans=0;
        if(left==right){
            return nums[left];
        }

        while(left<=right){
            int mid=left+(right-left)/2;
            int currentElement=nums[mid];
            int prevElement=-1;
            if(mid-1>=0){
                prevElement=nums[mid-1];
            }
            int nextElement=-1;
            if(mid+1<nums.length){
                nextElement=nums[mid+1];
            }

            if(currentElement!=prevElement && currentElement!=nextElement){
                return currentElement;
            }if(currentElement!=prevElement && currentElement==nextElement){
                int startingIndex=mid;
                if((startingIndex & 1)==1){
                    // ans=startingIndex;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }if(currentElement==prevElement && currentElement!=nextElement){
                int endingIndex=mid;
                if((endingIndex & 1)==1 ){
                    // ans=endingIndex;
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
            return -1;
    }
}