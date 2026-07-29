class Solution {
    public boolean isPossibleToSplit(int[] nums) {
       int[] freq = new int[101];
       for(int num=0;num<nums.length;num++){
        freq[nums[num]]++;
        if(freq[nums[num]]>2){
            return false;
        }
       }
       return true;
    }
}