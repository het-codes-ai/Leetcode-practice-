class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        Queue<Character> q1=new LinkedList<>();
        Queue<Character> q2=new LinkedList<>();
        int p=0;
        List<List<String>> ans=new ArrayList<>();
        while(p<s1.length()){
            StringBuilder sb1=new StringBuilder();
            StringBuilder sb2=new StringBuilder();
            List<String> pair=new ArrayList<>();
            if(s1.charAt(p)==s2.charAt(p)){
                while(!q1.isEmpty()){
                    sb1.append(q1.poll());
                    sb2.append(q2.poll());
                }
                p++;
            }
            if(sb1.length()>0){
                pair.add(sb1.toString());
                pair.add(sb2.toString());
            }
            while(p<s1.length() && s1.charAt(p)!=s2.charAt(p)){
                q1.offer(s1.charAt(p));
                q2.offer(s2.charAt(p));
                p++;
            }
            if(pair.size()>0){
                ans.add(pair);
            }
        }
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        List<String> pair=new ArrayList<>();
        while(!q1.isEmpty()){   
            sb1.append(q1.poll());
            sb2.append(q2.poll());
        }
        if(sb1.length()>0){
            pair.add(sb1.toString());
            pair.add(sb2.toString());
            ans.add(pair);   
        }     
        return ans;
    }
}
