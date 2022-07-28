class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();
        
        if (s.length() != t.length())
            return false;
        
       for (int i = 0; i < s.length();i++){
           if (hmap1.containsKey(s.charAt(i))){
              // int value = hmap.get(i);
              hmap1.put(s.charAt(i),hmap1.get(s.charAt(i))+1);
           }
           else{
               hmap1.put(s.charAt(i),1);
           }
       }
       
       for (int j = 0; j < t.length(); j++){
            if (hmap2.containsKey(t.charAt(j))){
              // int value = hmap.get(i);
              hmap2.put(t.charAt(j),hmap2.get(t.charAt(j))+1);
           }
           else{
               hmap2.put(t.charAt(j),1);
           }
           
           
       }
       
       return (hmap1.equals(hmap2));
        
    }
}