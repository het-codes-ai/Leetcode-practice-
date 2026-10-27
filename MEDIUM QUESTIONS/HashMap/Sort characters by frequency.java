class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            max = Math.max(max, map.get(ch));
        }

        StringBuilder ans = new StringBuilder();

        for (int freq = max; freq >= 1; freq--) {
            for (char ch : map.keySet()) {
                if (map.get(ch) == freq) {
                    for (int j = 0; j < freq; j++) {
                        ans.append(ch);
                    }
                }
            }
        }

        return ans.toString();
    }
}
