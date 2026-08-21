class Solution {
    



    static boolean palin(String s) {
      int i=0;
      int j=s.length()-1;
      while(i<=j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
      }
      return true;
    }

    public String longestPalindrome(String s) {

        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(palin(sub)){
                if(sub.length()>ans.length()){
                    ans=sub;
                }
                }
            }
        }
        return ans;
    
    }
}