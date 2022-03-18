// https://www.youtube.com/watch?v=ht-zr2xlfdk

// https://leetcode.com/problems/remove-duplicate-letters/discuss/1859410/JavaC%2B%2B-DETAILED-%2B-VISUALLY-EXPLAINED-!!

class Solution {
    public String removeDuplicateLetters(String s) {
        
        //Keep track of last index of the characters
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i; // track the lastIndex of character presence
        }
        
        boolean[] visited =  new boolean[26]; // keep track seen or visited
        
        Stack<Integer> st = new Stack();  //Creatinh int stack to store ascii number
        
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';
            if (visited[curr]) continue; // if seen continue as we need to pick one char only (no duplicates)
            
            while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]){
                visited[st.pop()] = false; // pop out and mark unseen
            }
            
            st.push(curr);          // add into stack
            visited[curr] = true;   // mark seen
        }

        StringBuilder sb = new StringBuilder();
        
        while (!st.isEmpty()){
            sb.append((char) (st.pop() + 'a'));  
            //converting that ASCII number to char by using (char) at front
        }
        
        return sb.reverse().toString();
    }
}