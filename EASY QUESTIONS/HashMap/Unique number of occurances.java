class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer,Integer> map1=new HashMap<>();
        HashSet <Integer> set=new HashSet<>();
        for(int num:arr){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for(int n:map1.keySet()){
            if(set.contains(map1.get(n))){
                return false;
            }
            set.add(map1.get(n));
        }
        return true;
    }
}
