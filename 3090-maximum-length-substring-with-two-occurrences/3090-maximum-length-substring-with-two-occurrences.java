class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int ans=0;
        int st=0;
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i))>2){
                map.put(s.charAt(st),map.get(s.charAt(st))-1);
                st++;
            }
            ans=Math.max(ans,i-st+1);
        }
        return ans;
    }
    
}