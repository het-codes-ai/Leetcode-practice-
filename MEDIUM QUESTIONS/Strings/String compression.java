class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int idx=0;
        for(int i=0;i<n;i++){
            char ch=chars[i];
            int count=0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            chars[idx]=ch;
            idx++;
            
            if(count>1){
                for(char c : Integer.toString(count).toCharArray()){
                    chars[idx]=c;
                    idx++;
                }
            }   
            i--;
        }
        return idx;
    }
}