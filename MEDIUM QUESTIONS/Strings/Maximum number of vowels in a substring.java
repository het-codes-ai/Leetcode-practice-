class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int p1=0;
        int p2=0;
        int curr=0;          
            for(int i=0;i<k;i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    curr++;
                }
                p2++;
            }
            max=Math.max(max,curr);
            while(p2<s.length()){
                if(s.charAt(p1)=='a' || s.charAt(p1)=='e' || s.charAt(p1)=='i' || s.charAt(p1)=='o' || s.charAt(p1)=='u'){
                    curr--;
                }
                p1++;
                if(s.charAt(p2)=='a' || s.charAt(p2)=='e' || s.charAt(p2)=='i' || s.charAt(p2)=='o' || s.charAt(p2)=='u'){
                    curr++;
                }
                p2++;
                max=Math.max(max,curr);
                if(max==k){
                    return k;
                }
        }
        return max;
    }
}
