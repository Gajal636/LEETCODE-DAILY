class Solution {
    static void solve(int n,int k,int index,List<List<Integer>> curr, List<Integer> output){
        if(output.size()==k){
            curr.add(new ArrayList<>(output));
            return;
        }
        for(int i=index;i<=n;i++){
            output.add(i);
            solve(n,k,i+1,curr,output);
            output.remove(output.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> curr=new ArrayList<>();
         List<Integer> output=new ArrayList<>();
         int index=1;
         solve(n,k,index,curr,output);
         return curr;
    }
}