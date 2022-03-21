/*
https://www.youtube.com/watch?v=ED4ateJu86I&t=276s

Algorithm:
1. Make array of Last occurrence of the characters, that is lastIndexArray
2. Keep checking until the character is not equal to last occurrence

*/

class Solution {
    public List<Integer> partitionLabels(String s) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        //Getting the last occurence of each character
        int[] lastSeen = new int[26];
        for (int i = 0; i < s.length() ; i++){
            lastSeen[s.charAt(i) - 'a'] = i;
        }
        
        int i = 0;
        while (i < s.length()){
            int end = lastSeen[s.charAt(i) - 'a'];
            int j = i;
            while (j  != end){
                //change the end index to the last seen index if found
                end = Math.max( end, lastSeen[s.charAt(j) - 'a']);
                j++;
            }
            
            ans.add(j - i + 1);
            i = j+1;   //Move i to j+1 index
        }
        
        return ans;
        
    }
}