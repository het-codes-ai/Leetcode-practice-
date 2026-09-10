class Solution {
    public String toLowerCase(String s) {
        char []ans=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c>='A' && c<='Z'){
                ans[i]=(char)(c+32);
            }
        }
        return new String (ans);
    }
}