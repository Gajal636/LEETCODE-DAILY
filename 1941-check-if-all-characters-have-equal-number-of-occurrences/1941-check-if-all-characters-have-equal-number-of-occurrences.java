class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int freq=map.values().iterator().next();
        for (int val : map.values()) {
             if (val != freq) {
                return false;
            }
        }
        return true;
    }
}