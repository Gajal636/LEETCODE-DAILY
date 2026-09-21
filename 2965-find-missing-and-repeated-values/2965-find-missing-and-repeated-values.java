class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        int n=grid.length;
        int freq[]=new int[n*n+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                freq[grid[i][j]]++;
            }
        }
        int repeated=0;
        int missing=0;
        for(int i=0;i<=n*n;i++){
            if(freq[i]==2){
                repeated=i;
            }
            if(freq[i]==0){
                missing=i;
            }
        }
  return new int[]{repeated,missing};
    }
}