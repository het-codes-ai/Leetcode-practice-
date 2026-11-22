class Solution {
    public boolean checkString(String s) {
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains('b') && s.charAt(i)=='a'){
                return false;
            }
            set.add(s.charAt(i));
        }
        return true;
    }
}
