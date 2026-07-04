class Solution {
    static boolean isValidAns(int[]piles,int h, int minBanana){
         int totalHours = 0;
for (int pile : piles) {
    totalHours += Math.ceil((double)pile / minBanana);
}
return totalHours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        // int e  // Arrays.sort(arr);
        int left=1;
        // int right=arr.length-1;
        int maxi=-1;
        for(int i=0;i<piles.length;i++){
            if(maxi<piles[i]){
                maxi=piles[i];
            }
        }
        int right=maxi;
        int ans=0;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isValidAns(piles,h,mid)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
        
    
    }
}