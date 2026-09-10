class Solution {
    public String reverseWords(String s) {
        int n=s.length();        
        StringBuilder ans=new StringBuilder();
        StringBuilder word=new StringBuilder();
        for(int idx=0;idx<n;idx++){       
             if(s.charAt(idx)!=' '){            
                word.append(s.charAt(idx));   
            }
             if(s.charAt(idx)==' ' || idx==n-1){
                word.reverse();
                if(ans.length()>0){
                    ans.append(' ');
                }      
                ans.append(word);
                word.setLength(0);                      
            }          
            
        }
        return ans.toString();
    }
}