class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int st = i;
            int end = i;
            while (st >= 0 && end < n) {
                if (s.charAt(st) == s.charAt(end)) {
                    ans++;
                    st--;
                    end++;
                } else {
                    break;
                }
            }
            st = i;
            end = i + 1;
            while (st >= 0 && end < n) {
                if (s.charAt(st) == s.charAt(end)) {
                    ans++;
                    st--;
                    end++;
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}