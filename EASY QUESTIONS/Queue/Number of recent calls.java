class RecentCounter {
    Queue <Integer> q =new LinkedList<>();
    public RecentCounter() {
       
    }
    
    public int ping(int t) {
        q.offer(t);
        if(q.isEmpty()){
            return 0;
        }
        while(q.peek()<t-3000){
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
