class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        int h = 0;
        int w = 0;
        while (i < j) {
            w = Math.min(height[i], height[j]);
            h = j - i;
            int area = w * h;
            if (area > max) {
                max = area;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }
        return max;
    }
}