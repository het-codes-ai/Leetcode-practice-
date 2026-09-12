class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int end = n - 1;
        int st = 0;

        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        st = end;
        while (st >= 0 && s.charAt(st) != ' ') {
            st--;
        }
        return end - st;
    }
}