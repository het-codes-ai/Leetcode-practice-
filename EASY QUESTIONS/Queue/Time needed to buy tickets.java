class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        int i=0;
        int n=tickets.length;
        while(tickets[k]!=0){
            if(tickets[i]==0){
                i=(i+1)%n;
            }
            else{
                tickets[i]-=1;
                i=(i+1)%n;
                time++;
            }
        }
        return time;
    }
}
