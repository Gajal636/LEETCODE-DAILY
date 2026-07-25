class Solution {  
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int ans=0;
        for(int item[]:boxTypes){
            if(truckSize>=item[0]){
                ans+=item[0]*item[1];
                truckSize-=item[0];
            }else{
                ans+=truckSize*item[1];
                break;
            }
        }
        return ans;
    }
}