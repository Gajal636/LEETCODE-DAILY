class Solution {
    public int countKeyChanges(String s) {
        String str = s.toLowerCase();
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                count = count + 1;
            }
        }
        return count;
    }
}