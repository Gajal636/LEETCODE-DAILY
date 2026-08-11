class Solution {
    public int missingInteger(int[] nums) {

        int sum = nums[0];

        // Find the sum of the longest consecutive prefix
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        Set<Integer> set = new HashSet<>();

        for (int val : nums) {
            set.add(val);
        }

        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}