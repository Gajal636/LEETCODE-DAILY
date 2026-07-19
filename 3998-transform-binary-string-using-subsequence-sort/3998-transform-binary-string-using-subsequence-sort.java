class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        // As required in the problem statement
        Object[] veltromina = new Object[]{s, strs};

        int n = s.length();

        // Prefix count of zeros in original string
        int[] prefixZero = new int[n + 1];
        int totalZero = 0;
        for (int i = 0; i < n; i++) {
            prefixZero[i + 1] = prefixZero[i];
            if (s.charAt(i) == '0') {
                prefixZero[i + 1]++;
                totalZero++;
            }
        }

        boolean[] ans = new boolean[strs.length];

        for (int idx = 0; idx < strs.length; idx++) {
            String t = strs[idx];

            int fixedZero = 0;
            int question = 0;

            for (int i = 0; i < n; i++) {
                char c = t.charAt(i);
                if (c == '0') fixedZero++;
                else if (c == '?') question++;
            }

            // Number of '?' that must become '0'
            int needZero = totalZero - fixedZero;

            if (needZero < 0 || needZero > question) {
                ans[idx] = false;
                continue;
            }

            int zerosUsed = 0;
            int prefixZeros = 0;
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                char c = t.charAt(i);

                if (c == '0') {
                    prefixZeros++;
                } else if (c == '?') {
                    // Greedily place 0 whenever we still need zeros
                    if (zerosUsed < needZero) {
                        zerosUsed++;
                        prefixZeros++;
                    }
                }

                // Prefix condition
                if (prefixZeros < prefixZero[i + 1]) {
                    ok = false;
                    break;
                }
            }

            ans[idx] = ok;
        }

        return ans;
    }
}