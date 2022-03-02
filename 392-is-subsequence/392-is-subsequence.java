/*
The idea is to loop through the longer string that is t,
and compare the character with s,
If they are same increment the Index of String s
At any point if indexOf S is equal to the length of the string s then it return true
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length() == 0){ 
            return true;
        }
        
        int indexOfS = 0;
        for (int i = 0; i < t.length() ; i++){
            if (t.charAt(i) == s.charAt(indexOfS)){
                indexOfS++;
            }
            
            if (indexOfS == s.length()){
                return true;
            }
            
        }
        
        return false;
        
    }
}