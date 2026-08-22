class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        for(int i=0;i<s.length();i++){
            //opening braces
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' ){
                a.push(s.charAt(i));
            }
            //closing braces 
            else{
                if(a.isEmpty()){
                    return false;
                }
                else{
                    char top=a.pop();
                    if(s.charAt(i)==')' && top!='('){
                        return false;
                    }
                     if(s.charAt(i)=='}' && top!='{'){
                        return false;
                    }
                     if(s.charAt(i)==']' && top!='['){
                        return false;
                    }
                }
            }
        }
        return a.isEmpty();
    }
}