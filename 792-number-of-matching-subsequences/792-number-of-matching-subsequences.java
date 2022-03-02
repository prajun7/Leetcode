//Check : 392. Is Subsequence before this

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        
        //alreadySequence HashSet, stores those words which already is a sequence
        //So, we don't have to compute again
        HashSet<String> alreadySequence = new HashSet<>();
        
        //noSequence HashSet, stores those words which id not a sequence
        //So, we don't have to compute again
        HashSet<String> noSequence = new HashSet<>();
        
        for (String word : words){
            
            if (noSequence.contains(word)){
                continue;   //It will just skip that loop and move to next iteration
            }
            
            if (alreadySequence.contains(word)){
                count++;
                continue;
            }
            
            if (isSubsequence ( s , word )){
                count++;
                alreadySequence.add(word);
            }
            else{
                noSequence.add(word);
            }
        }
        return count;
    }
    
    
    // Method to check if that word is a sequence or not
    // Check : 392. Is Subsequence before this
    public boolean isSubsequence(String s, String word){
        
        if (word.length() == 0){
            return true;
        }
        
        int indexOfWords = 0;
        
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == word.charAt(indexOfWords)){
                indexOfWords++;
            }
            
            if (indexOfWords == word.length()){
                return true;
            }
        }
        
        return false;
        
    }
    
}