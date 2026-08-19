class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String st = strs[0];
        String end = strs[strs.length - 1];
        int idx = 0;
        while (idx < st.length() && idx < end.length()) {
            if (st.charAt(idx) == end.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return st.substring(0, idx);
    }
}