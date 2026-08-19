class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
       Set<Integer>set=new HashSet<>();
       Set<Integer>duplicate=new HashSet<>();
       for(int num:nums){
        if(set.contains(num)){
            duplicate.add(num);
        }else set.add(num);
       }
       for(int num:set){
        if(!duplicate.contains(num)) sum+=num;
       }
       return sum;
    }
}