class Solution {
    public boolean wordPattern(String pattern, String s) {
        int patternLength = pattern.length();
        String wordsArray[] = s.split(" ");
        int wordsLength = wordsArray.length;
        
        if(patternLength != wordsLength){
            return false;
        }
        
        HashMap<Character,String> hmap = new HashMap<>();
        
        for(int i = 0; i < patternLength ; i++){
            char current_char = pattern.charAt(i);
            if (hmap.containsKey(current_char)){
                 if (!hmap.get(current_char).equals(wordsArray[i])) {
                    return false;
                }
                
            }else{
                
                //If a word is already in a hashMap before adding it, than
                //that means it is map to the different character
                if (hmap.containsValue(wordsArray[i])){
                    return false;
                }
                
                hmap.put(current_char, wordsArray[i]); 
            }
        }
        return true;
        
    }
}