class Solution {
    public int reverseBits(int n) {
        String ans=Integer.toBinaryString(n);
        while(ans.length()<32){
            ans="0"+ans;
        }
        String reverse="";
        for(int i=ans.length()-1;i>=0;i--){
             reverse+=ans.charAt(i);
        }
        return Integer.parseInt(reverse,2);
    }
}