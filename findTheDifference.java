class Solution {
    public char findTheDifference(String s, String t) {
        // Initialize variables to store sum of ASCII codes for 
        // each string
        
        int charSumS = 0;
        int charSumT = 0;
        // Iterate through both strings and char codes
        for (char ch: s.toCharArray()){
            charSumS += (int)ch;
        }
        
        for (char ch: t.toCharArray()){
            charSumT += (int)ch;
        }
        
        // Return the difference between 2 strings as char
        return (char)(charSumT-charSumS);
    }
        
}
