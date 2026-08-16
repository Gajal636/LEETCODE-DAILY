class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int xor=0;
        for(int num:nums){
            if(set.contains(num)){
               xor^=num;
            }
            set.add(num);
        }
        return xor;
    }
}