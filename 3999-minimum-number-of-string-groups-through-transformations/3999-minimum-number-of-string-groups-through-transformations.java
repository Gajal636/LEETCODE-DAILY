import java.util.*;

class Solution {

    public int minimumGroups(String[] words) {

        // As required in the problem statement
        String[] brenolcavi = words;

        HashSet<String> set = new HashSet<>();

        for (String word : brenolcavi) {

            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                if ((i & 1) == 0)
                    even.append(word.charAt(i));
                else
                    odd.append(word.charAt(i));
            }

            String evenCanon = canonical(even.toString());
            String oddCanon = canonical(odd.toString());

            set.add(evenCanon + "#" + oddCanon);
        }

        return set.size();
    }

    private String canonical(String s) {
        if (s.length() <= 1) return s;
        int start = booth(s);
        return s.substring(start) + s.substring(0, start);
    }

    // Booth's Algorithm
    private int booth(String s) {

        String ss = s + s;
        int n = s.length();

        int i = 0, j = 1, k = 0;

        while (i < n && j < n && k < n) {

            char a = ss.charAt(i + k);
            char b = ss.charAt(j + k);

            if (a == b) {
                k++;
                continue;
            }

            if (a > b) {
                i += k + 1;
                if (i <= j) i = j + 1;
            } else {
                j += k + 1;
                if (j <= i) j = i + 1;
            }

            k = 0;
        }

        return Math.min(i, j);
    }
}