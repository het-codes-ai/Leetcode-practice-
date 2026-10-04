class Solution {
    public int minRotations(String s) {
        int d = s.charAt(0) - '0';
        int rotation = Math.min(d, 10 - d);

        for (int i = 0; i < s.length() - 1; i++) {
            d = Math.abs((s.charAt(i) - '0') - (s.charAt(i + 1) - '0'));
            rotation += Math.min(d, 10 - d);
        }

        return rotation;
    }
}