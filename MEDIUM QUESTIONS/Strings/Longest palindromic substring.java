class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0){
            return "";
        }
        int st=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int odd=expand(s,i,i);
            int even=expand(s,i,i+1);
            int max_len=Math.max(odd,even);

            if(max_len>end-st){
                st=i-(max_len-1)/2;
                end=i+(max_len)/2;
            }
        }
        return s.substring(st,end+1);
    }
    public int expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
