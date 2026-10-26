class Solution {
    public boolean wordPattern(String pattern, String s) {
    HashMap <Character,String> map1 = new HashMap<>();
    HashMap <String,Character> map2 = new HashMap<>();
        int n=pattern.length();
        String[] words=s.split(" ");
        if(n!=words.length){
            return false;
        }
        for(int i=0;i<n;i++){
            char letter=pattern.charAt(i);
            String word=words[i];
            if(map1.containsKey(letter) && !map1.get(letter).equals(word)){
                return false;
            }
            if(map2.containsKey(word) && map2.get(word)!=(letter)){
                return false;
            }
            map1.put(letter,word);
            map2.put(word,letter);
        }
        return true;
    }
}
