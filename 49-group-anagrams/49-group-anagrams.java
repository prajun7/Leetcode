class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        for(String w : strs){
            String key = hash(w);          
            if(!map.containsKey(key)) map.put(key, new LinkedList<>());
            map.get(key).add(w);
        }
        
        return new ArrayList<>(map.values());
    }
    
    String hash(String s){
        int[] a = new int[26];
        for(char c : s.toCharArray()) a[c-'a']++;
        return Arrays.toString(a);
    }
}