class Solution {
    public boolean isAnagram(String s, String t) {
        int a=s.length();
        int b=t.length();
        if(a!=b){
            return false;
        }
        int [] freq = new int[26];
        for(int i=0;i<a;i++){
           freq[s.charAt(i)-'a']++;
           freq[t.charAt(i)-'a']--; 
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;        
    }
}