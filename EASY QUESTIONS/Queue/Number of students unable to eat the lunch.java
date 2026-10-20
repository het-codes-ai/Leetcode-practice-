class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        int count=0;
        int i=0;
        for(int num:students){
            q.offer(num);
        }
        while(i!=sandwiches.length && count!=q.size()){
            if(sandwiches[i]==q.peek()){
                i++;
                q.poll();
                count=0;
            }
            else{
                q.offer(q.poll());
                count++;
            }
        }
        return q.size();
    }
}
