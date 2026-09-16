class Solution {
    public static Boolean isPalindrome(String s,int left,int right){
        while(left<=right){
        if(s.charAt(left)!=s.charAt(right)){                   
            return false;
      }
        left++;
        right--;
    }
    return true;
    }
    public boolean validPalindrome(String s) {
        int n=s.length();
        int st=0;
        int end=n-1;
       while(st<=end){
            if(s.charAt(st)==s.charAt(end)){   
                st++;
                end--;               
            }  
            else{
                return isPalindrome(s,st+1,end) || isPalindrome(s,st,end-1);
            }       
        }
        return true;
    }
}