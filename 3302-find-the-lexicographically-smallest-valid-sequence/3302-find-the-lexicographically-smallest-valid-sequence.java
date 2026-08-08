class Solution {
    public int[] validSequence(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int suffix[]=new int[n+1];
        int j=m-1;
        for(int i=n-1;i>=0;i--){
            suffix[i]=suffix[i+1];
            if(j>=0 && word1.charAt(i)==word2.charAt(j)){
                suffix[i]++;
                j--;
            }
        }

        int ans[]=new int[m];
        int i=0;
        int misMatch=0;

        for(j=0;j<m;j++){
            boolean found=false;
            while(i<n){
                if(word1.charAt(i)==word2.charAt(j)){
                    ans[j]=i;
                    i++;
                    found=true;
                    break;
                }if(misMatch==0){
                    int remaining=m-j-1;
                    if(suffix[i+1]>=remaining){
                    ans[j]=i;
                    i++;
                    misMatch++;
                    found=true;
                    break;
                    }
                }
                i++;
            }
            if(!found){
                return new int[0];
            }
        }
        return ans;
    }
}