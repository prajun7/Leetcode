//Check : 392. Is Subsequence before this

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        HashSet<String> alreadySequence = new HashSet<>();
         HashSet<String> noSequence = new HashSet<>();
        
        for (String word : words){
            
            if (noSequence.contains(word)){
                continue;
            }
            
            if (alreadySequence.contains(word)){
                count++;
            }
            
            else if (isSubsequence ( s , word )){
                count++;
                alreadySequence.add(word);
            }
            else{
                noSequence.add(word);
            }
        }
        return count;
    }
    
    
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