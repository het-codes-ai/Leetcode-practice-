class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> st=new Stack<>();
        int n=operations.length;
        for(int i=0;i<n;i++){
            
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int temp=st.peek();
                st.push(2*temp);
            }
            else if(operations[i].equals("+")){
                int temp1=st.peek();
                st.pop();
                int temp2=st.peek();
                st.push(temp1);
                st.push(temp1+temp2);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        while(!st.isEmpty()){
            sum+=st.peek();
            st.pop();
        }
        return sum;
    }
}
