class Solution {
    public boolean isSubsequence(String s, String t) {
        int S=0;
        int T=0;
        if(s.length()==0){
            return true;
        }
        while(S<s.length() && T<t.length()){
            if(s.charAt(S)==t.charAt(T)){
                S++;
                T++;
            }
            else{
                T++;
            }
            if(S==s.length()){
                return true;
            }
        }
        return false;
    }
}