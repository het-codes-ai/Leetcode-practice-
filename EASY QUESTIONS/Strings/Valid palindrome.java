class Solution {
    public boolean isPalindrome(String s) {
        
        int n=s.length();
        int st=0;
        int end=n-1;
        while(st<end){
            if(! Character.isLetterOrDigit(s.charAt(st))){
                st++;
            }
            else if(! Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            else{
                if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(end))){                
                    return false; 
                    }
                    st++;
                    end--;                
           }
        }
        return true;
   }
}