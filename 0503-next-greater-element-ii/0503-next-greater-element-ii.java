class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[nums.length];
        int n=nums.length;
        for(int i=(2*n)-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i%n]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i%n]=-1;
            }else{
               ans[i%n]=nums[st.peek()];
            }

            st.push(i%n);
        }

      
        return ans;
    }
}