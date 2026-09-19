class Solution {
    public int firstUniqChar(String s) {
       Map<Character,Integer> map=new HashMap<>();
       Queue<Integer> q=new ArrayDeque<>();

       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        if(map.get(s.charAt(i))==1){
            q.add(i);
           
        }
        while(!q.isEmpty() && map.get(s.charAt(q.peek()))>1){
            q.poll();
        }

       }
        if(q.isEmpty()) return -1;
        else return q.peek();
    }
}