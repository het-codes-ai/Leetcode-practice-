class Solution {
   
    public boolean isValid(int speed,int[] piles,int h){
        int n=piles.length;
        long time=0;
        for(int idx=0;idx<n;idx++){
            int currentPile=piles[idx];            
            time+=currentPile/speed;
            if(currentPile%speed!=0){
                time++;
            }
            currentPile%=speed;
        }
        if(time<=h){
            return true ;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int st=1;
        int end=0;
        for(int i=0;i<n;i++){
            end=Math.max(end,piles[i]);
        }        
        while(st!=end){
            int mid=st+(end-st)/2;
            int speed=mid;
            if(isValid(speed,piles,h)){
                end=mid;
            }
            else{
                st=mid+1;
            }
        }
        return st;
    }
}