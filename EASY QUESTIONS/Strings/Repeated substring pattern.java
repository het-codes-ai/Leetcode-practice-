class Solution {
    public boolean repeatedSubstringPattern(String s) {        
        int n=s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i!=0){
                continue;
            }
            boolean valid=true;           
            for(int j=0;j<n;j++){
                if(s.charAt(j)!=s.charAt(j%i)){
                    valid=false;
                    break;
                  }                  
               }
            
            if(valid){
                return true;
            }                                 
        }
        return false;
    }
}