class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int ans=0;      
        int[] freq=new int[fruits.length];
        int distinct=0;
        
        
        for(int right=0;right<fruits.length;right++){
            if(freq[fruits[right]]==0){
                distinct++;
                }
                freq[fruits[right]]++;
            
            while(distinct>2){
                freq[fruits[left]]--;
                if(freq[fruits[left]]==0){
                    distinct--;
                }
                  left++;     
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}