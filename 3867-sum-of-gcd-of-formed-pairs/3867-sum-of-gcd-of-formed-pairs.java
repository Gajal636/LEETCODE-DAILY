class Solution {
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public long gcdSum(int[] nums) {
        int prefixGCD[] = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            max = Math.max(max, nums[i]);

            prefixGCD[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefixGCD);
        long ans = 0;
        int left = 0;
        int right = nums.length- 1;

        while (left < right) {
            ans += gcd(prefixGCD[left], prefixGCD[right]);
            left++;
            right--;
        }

        return ans;

    }
}