class Solution {
    public boolean canAliceWin(int[] nums) {
            int sum=0;
            int dSum=0;
        for(int i=0;i<nums.length;i++){
    
            
                
                if(nums[i]<10){
                    sum+=nums[i];
                }
                if(nums[i]>=10){
                    dSum+=nums[i];
                }
                
           
        }
            return sum!=dSum; 
    }
}