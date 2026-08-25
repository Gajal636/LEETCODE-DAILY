class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int val : nums) {
            set.add(val);
        }
        int value=k;
        while (set.contains(k)) {
            k += value;
        }

        return k;
    }
}