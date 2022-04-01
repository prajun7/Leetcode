class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
        
        int LSubstring = 0;
        int left = 0;
        for (int right = 0; right < s.length() ; right++){
            
            //Reduce the window, we jump directly to the left
            if (hMap.containsKey(s.charAt(right))){
                int index = hMap.get(s.charAt(right));
                left = Math.max(index + 1,left);  
             //    left = Math.max(left,map.get(s.charAt(right))+1);
      // Need to use math.max because we 
     // don't want left pointer to move backwards
    // if input="abbabc" and when i = 3, s.chatAt(3) == 'a' ,
   // we will found last 'a' appears at index 0,
  // but we should not update j from 2 ('b') to 0 ('a'),
 // because here although the 'a' is in hashMap, but it appears before 'b'.
                
            }
            //If we put else it won't work
            
                hMap.put(s.charAt(right), right);
                LSubstring = Math.max(right - left + 1,LSubstring);        
        }
        return LSubstring;
    }    
}
